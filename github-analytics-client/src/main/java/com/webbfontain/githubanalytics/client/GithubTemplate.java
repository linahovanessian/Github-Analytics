package com.webbfontain.githubanalytics.client;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.webbfontain.githubanalytics.config.GithubConfig;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author linahovanessian on 11/6/18.
 */
public class GithubTemplate implements GithubOperations {

    private RestTemplate restTemplate;
    private GithubConfig githubConfig;

    public GithubTemplate(GithubConfig githubConfig) {
        this.githubConfig = githubConfig;
        this.restTemplate = restTemplate( new RestTemplateBuilder() );
    }

    public GithubTemplate(GithubConfig githubConfig, RestTemplateBuilder restTemplateBuilder) {
        this.githubConfig = githubConfig;
        this.restTemplate = restTemplate( restTemplateBuilder );
    }

    @Override
    public <T> ResponseEntity<T> getForEntity(String path, Class<T> responseType) throws RestClientException {
        return restTemplate.getForEntity( githubUrl( path ), responseType );
    }


    private RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.basicAuthentication(
                githubConfig.getUsername(),
                githubConfig.getPassword()
        ).additionalMessageConverters(
                new MappingJackson2HttpMessageConverter( Jackson2ObjectMapperBuilder.json()
                        .featuresToEnable( SerializationFeature.WRAP_ROOT_VALUE )
                        .featuresToDisable( SerializationFeature.WRITE_DATES_AS_TIMESTAMPS )

                        .modules(
                                new JavaTimeModule().addDeserializer( LocalDateTime.class,
                                        new LocalDateTimeDeserializer( DateTimeFormatter.ISO_DATE_TIME )
                                )
                        ).build() )
        ).build();
    }

    public String getBaseUrl() {
        return "https://api.github.com";
    }

    public String githubUrl(String path) {
        final String baseUrl = getBaseUrl();

        if (path == null || "".equals( path )) {
            return baseUrl;
        }

        return path.startsWith( "/" ) ? baseUrl + path : baseUrl + "/" + path;
    }

}
