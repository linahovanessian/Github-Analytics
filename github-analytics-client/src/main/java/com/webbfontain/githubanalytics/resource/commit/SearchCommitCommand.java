package com.webbfontain.githubanalytics.resource.commit;

import com.webbfontain.githubanalytics.resource.Command;

/**
 * @author linahovanessian on 11/7/18.
 */
public class SearchCommitCommand implements Command {
    private String command;
    //https://api.github.com/search/commits?q=repo:octocat/Spoon-Knife+css&author:octocat


    public SearchCommitCommand(String repoName, String ownerName) {
        String path = new String( "/repos/{ownerName}/{repoName}/commits?per_page=100&page=1&sha=master" );
        this.command = path.replace( "{ownerName}", ownerName ).replace( "{repoName}", repoName );
    }

    @Override
    public String getCommand() {
        return command;
    }
}
