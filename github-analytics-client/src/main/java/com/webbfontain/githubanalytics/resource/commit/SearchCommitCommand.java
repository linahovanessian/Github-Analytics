package com.webbfontain.githubanalytics.resource.commit;

/**
 * @author linahovanessian on 11/7/18.
 */
public class SearchCommitCommand {
    private String command;
    //https://api.github.com/search/commits?q=repo:octocat/Spoon-Knife+css&author:octocat


    public SearchCommitCommand(String repoName, String ownerName) {
        String path = new String( "/repos/{ownerName}/{repoName}/commits?per_page=100&page=1&sha=master" );
        this.command = path.replace( "{ownerName}", ownerName ).replace( "{repoName}", repoName );
    }

    public String getCommand() {
        return command;
    }
}
