package com.webbfontain.githubanalytics.resource.repository;

import com.webbfontain.githubanalytics.client.GithubTemplate;
import com.webbfontain.githubanalytics.domain.RepositoryList;

/**
 * @author linahovanessian on 11/6/18.
 */
public class RepositoryServiceImpl implements RepositoryService {


    private GithubTemplate githubTemplate;

    public RepositoryServiceImpl(GithubTemplate githubTemplate) {
        this.githubTemplate = githubTemplate;
    }


    @Override
    public RepositoryList searchPublicRepositories(SearchRepositoryCommand searchRepositoryCommand) {
        return githubTemplate.getForEntity( searchRepositoryCommand.getCommand(), RepositoryList.class ).getBody();
    }
}

