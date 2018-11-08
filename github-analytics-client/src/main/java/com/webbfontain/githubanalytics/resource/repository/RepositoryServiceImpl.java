package com.webbfontain.githubanalytics.resource.repository;

import com.webbfontain.githubanalytics.client.GithubTemplate;
import com.webbfontain.githubanalytics.domain.RepositoryList;
import com.webbfontain.githubanalytics.resource.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author linahovanessian on 11/6/18.
 */
public class RepositoryServiceImpl implements RepositoryService {
    Logger logger = LoggerFactory.getLogger( RepositoryServiceImpl.class );


    private GithubTemplate githubTemplate;

    public RepositoryServiceImpl(GithubTemplate githubTemplate) {
        this.githubTemplate = githubTemplate;
    }


    @Override
    public RepositoryList searchPublicRepositories(Command command) {
        logger.info( "searchPublicRepositories command = " + command.getCommand() );
        return githubTemplate.getForEntity( command.getCommand(), RepositoryList.class ).getBody();
    }
}

