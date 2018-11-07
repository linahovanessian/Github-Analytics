package com.webbfontain.githubanalytics.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestClientException;

/**
 * @author linahovanessian on 11/6/18.
 */
public interface GithubOperations {


    <T> ResponseEntity<T> getForEntity(String path, Class<T> responseType) throws RestClientException;

    <T> ResponseEntity<T> exchange(String path, HttpMethod method, @Nullable HttpEntity<?> requestEntity,
                                   ParameterizedTypeReference<T> responseType, Object... uriVariables) throws RestClientException;
}