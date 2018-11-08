package com.webbfontain.githubanalytics.resource.contributor;

import com.webbfontain.githubanalytics.resource.Command;

/**
 * @author linahovanessian on 11/6/18.
 */
public class GetContributorsCommand implements Command {
    private String command;

    public GetContributorsCommand(String ownerName, String repoName) {
        String path = new String( "/repos/{ownerName}/{repoName}/contributors?per_page=100&page=1" );
        this.command = path.replace( "{ownerName}", ownerName ).replace( "{repoName}", repoName );

    }

    @Override
    public String getCommand() {
        return command;
    }

}
