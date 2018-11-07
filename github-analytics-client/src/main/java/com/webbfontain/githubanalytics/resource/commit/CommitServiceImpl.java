package com.webbfontain.githubanalytics.resource.commit;

import com.webbfontain.githubanalytics.client.GithubTemplate;
import com.webbfontain.githubanalytics.domain.CommitList;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

/**
 * @author linahovanessian on 11/7/18.
 */
public class CommitServiceImpl implements CommitService {

    private GithubTemplate githubTemplate;


    public CommitServiceImpl(GithubTemplate githubTemplate) {
        this.githubTemplate = githubTemplate;
    }


    @Override
    public CommitList getCommits(SearchCommitCommand searchCommitCommand) {
        return githubTemplate.exchange(
                searchCommitCommand.getCommand(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<CommitList>() {
                }
        ).getBody();
        // return githubTemplate.getForEntity( searchCommitCommand.getCommand(), CommitList.class ).getBody();
    }
}
