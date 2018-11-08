package com.webbfontain.githubanalytics.service;

import com.webbfontain.githubanalytics.domain.CommitList;
import com.webbfontain.githubanalytics.domain.ContributorList;
import com.webbfontain.githubanalytics.domain.RepositoryList;
import com.webbfontain.githubanalytics.resource.Command;
import com.webbfontain.githubanalytics.resource.commit.CommitService;
import com.webbfontain.githubanalytics.resource.contributor.ContributorService;
import com.webbfontain.githubanalytics.resource.repository.RepositoryService;
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
    public RepositoryList searchPublicRepositories(Command command) {
        return repositoryService.searchPublicRepositories( command );
    }

    @Override
    public ContributorList getProjectContributorList(Command command) {
        return contributorService.getProjectContributorList( command );
    }

    @Override
    public CommitList getCommits(Command command) {
        return commitService.getCommits( command );
    }


}
