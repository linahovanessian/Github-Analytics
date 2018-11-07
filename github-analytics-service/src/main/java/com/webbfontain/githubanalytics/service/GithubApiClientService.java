package com.webbfontain.githubanalytics.service;

import com.webbfontain.githubanalytics.domain.CommitList;
import com.webbfontain.githubanalytics.domain.ContributorList;
import com.webbfontain.githubanalytics.domain.RepositoryList;
import com.webbfontain.githubanalytics.resource.commit.SearchCommitCommand;
import com.webbfontain.githubanalytics.resource.contributor.GetContributorsCommand;
import com.webbfontain.githubanalytics.resource.repository.SearchRepositoryCommand;

/**
 * @author linahovanessian on 11/6/18.
 */
public interface GithubApiClientService {

    RepositoryList searchPublicRepositories(SearchRepositoryCommand searchRepositoryCommand);

    ContributorList getProjectContributorList(GetContributorsCommand contributorsCommand);

    CommitList getCommits(SearchCommitCommand searchCommitCommand);
}
