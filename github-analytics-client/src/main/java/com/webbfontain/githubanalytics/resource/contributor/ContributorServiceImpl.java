package com.webbfontain.githubanalytics.resource.contributor;


import com.webbfontain.githubanalytics.client.GithubTemplate;
import com.webbfontain.githubanalytics.domain.ContributorList;
import com.webbfontain.githubanalytics.resource.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author linahovanessian on 11/6/18.
 */
public class ContributorServiceImpl implements ContributorService {
    Logger logger = LoggerFactory.getLogger( ContributorServiceImpl.class );
    private GithubTemplate githubTemplate;

    public ContributorServiceImpl(GithubTemplate githubTemplate) {
        this.githubTemplate = githubTemplate;
    }


    @Override
    public ContributorList getProjectContributorList(Command command) {
        logger.info( "searchPublicRepositories command = " + command.getCommand() );
        return githubTemplate.getForEntity( command.getCommand(), ContributorList.class ).getBody();
    }
}
