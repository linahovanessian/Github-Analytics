package com.webbfontain.githubanalytics.config;

import com.webbfontain.githubanalytics.client.GithubTemplate;
import com.webbfontain.githubanalytics.resource.commit.CommitService;
import com.webbfontain.githubanalytics.resource.commit.CommitServiceImpl;
import com.webbfontain.githubanalytics.resource.contributor.ContributorService;
import com.webbfontain.githubanalytics.resource.contributor.ContributorServiceImpl;
import com.webbfontain.githubanalytics.resource.repository.RepositoryService;
import com.webbfontain.githubanalytics.resource.repository.RepositoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * @author linahovanessian on 11/6/18.
 */

@Configuration
@EnableConfigurationProperties({GithubApiProperties.class})
public class BeanConfig {

    GithubApiProperties properties;

    @Autowired
    public BeanConfig(GithubApiProperties properties) {
        this.properties = properties;
    }

    @Bean
    GithubTemplate githubTemplate() {
        GithubConfigBuilder configBuilder =
                new GithubConfigBuilder().username( properties.getApi().getUsername() )
                        .password( properties.getApi().getPassword() );
        return new GithubTemplate( configBuilder.build() );
    }

    @Bean
    public RepositoryService repositoryService() {
        return new RepositoryServiceImpl( githubTemplate() );
    }

    @Bean
    public ContributorService contributorService() {
        return new ContributorServiceImpl( githubTemplate() );
    }

    @Bean
    public CommitService commitService() {
        return new CommitServiceImpl( githubTemplate() );
    }

    @Bean
    public UrlBasedViewResolver viewResolver() {
        UrlBasedViewResolver resolver
                = new UrlBasedViewResolver();
        resolver.setPrefix( "/WEB-INF/jsp/" );
        resolver.setSuffix( ".jsp" );
        resolver.setViewClass( JstlView.class );
        return resolver;
    }

}
