package com.webbfontain.githubanalytics.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

/**
 * @author linahovanessian on 11/6/18.
 */
public interface GithubOperations {

    // <T> ResponseEntity<T> getForEntity(String path, Class<T> responseType, Object... uriVariables) throws
    //       RestClientException;

    <T> ResponseEntity<T> getForEntity(String path, Class<T> responseType) throws RestClientException;
}