package com.webbfontain.githubanalytics.resource.repository;

import com.webbfontain.githubanalytics.domain.RepositoryList;

/**
 * @author linahovanessian on 11/6/18.
 */
public interface RepositoryService {


    RepositoryList searchPublicRepositories(SearchRepositoryCommand searchRepositoryCommand);
}
