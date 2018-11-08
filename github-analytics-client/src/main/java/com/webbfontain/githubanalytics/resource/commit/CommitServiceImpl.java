package com.webbfontain.githubanalytics.resource.commit;

import com.webbfontain.githubanalytics.client.GithubTemplate;
import com.webbfontain.githubanalytics.domain.CommitList;
import com.webbfontain.githubanalytics.resource.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

/**
 * @author linahovanessian on 11/7/18.
 */
public class CommitServiceImpl implements CommitService {
    Logger logger = LoggerFactory.getLogger( CommitServiceImpl.class );
    private GithubTemplate githubTemplate;


    public CommitServiceImpl(GithubTemplate githubTemplate) {
        this.githubTemplate = githubTemplate;
    }


    @Override
    public CommitList getCommits(Command command) {
        logger.info( "searchPublicRepositories command = " + command.getCommand() );
        return githubTemplate.exchange( command.getCommand(), HttpMethod.GET, null, new ParameterizedTypeReference<CommitList>() {
                }
        ).getBody();
        // return githubTemplate.getForEntity( searchCommitCommand.getCommand(), CommitList.class ).getBody();
    }
}
