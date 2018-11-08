package com.webbfontain.githubanalytics.service;

import com.webbfontain.githubanalytics.domain.CommitList;
import com.webbfontain.githubanalytics.domain.ContributorList;
import com.webbfontain.githubanalytics.domain.RepositoryList;
import com.webbfontain.githubanalytics.resource.Command;

/**
 * @author linahovanessian on 11/6/18.
 */
public interface GithubApiClientService {

    RepositoryList searchPublicRepositories(Command command);

    ContributorList getProjectContributorList(Command command);

    CommitList getCommits(Command command);
}
