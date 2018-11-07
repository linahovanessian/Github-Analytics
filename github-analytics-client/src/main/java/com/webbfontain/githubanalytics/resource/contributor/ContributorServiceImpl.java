package com.webbfontain.githubanalytics.resource.contributor;


import com.webbfontain.githubanalytics.client.GithubTemplate;
import com.webbfontain.githubanalytics.domain.ContributorList;

/**
 * @author linahovanessian on 11/6/18.
 */
public class ContributorServiceImpl implements ContributorService {

    private GithubTemplate githubTemplate;

    public ContributorServiceImpl(GithubTemplate githubTemplate) {
        this.githubTemplate = githubTemplate;
    }


    @Override
    public ContributorList getProjectContributorList(GetContributorsCommand contributorsCommand) {
        return githubTemplate.getForEntity( contributorsCommand.getCommand(), ContributorList.class ).getBody();
    }
}
