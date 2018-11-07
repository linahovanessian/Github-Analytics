package com.webbfontain.githubanalytics.service;

import com.webbfontain.githubanalytics.domain.CommitList;
import com.webbfontain.githubanalytics.domain.ContributorList;
import com.webbfontain.githubanalytics.domain.RepositoryList;
import com.webbfontain.githubanalytics.resource.commit.CommitService;
import com.webbfontain.githubanalytics.resource.commit.SearchCommitCommand;
import com.webbfontain.githubanalytics.resource.contributor.ContributorService;
import com.webbfontain.githubanalytics.resource.contributor.GetContributorsCommand;
import com.webbfontain.githubanalytics.resource.repository.RepositoryService;
import com.webbfontain.githubanalytics.resource.repository.SearchRepositoryCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linahovanessian on 11/6/18.
 */
@Service
public class GithubApiClientServiceImpl implements GithubApiClientService {

    @Autowired
    public RepositoryService repositoryService;

    @Autowired
    public ContributorService contributorService;

    @Autowired
    public CommitService commitService;


    @Override
    public RepositoryList searchPublicRepositories(SearchRepositoryCommand searchRepositoryCommand) {
        return repositoryService.searchPublicRepositories( searchRepositoryCommand );
    }

    @Override
    public ContributorList getProjectContributorList(GetContributorsCommand contributorsCommand) {
        return contributorService.getProjectContributorList( contributorsCommand );
    }

    @Override
    public CommitList getCommits(SearchCommitCommand searchCommitCommand) {
        return commitService.getCommits( searchCommitCommand );
    }


}
