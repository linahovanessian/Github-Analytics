package com.webbfontain.githubanalytics.resource.commit;

/**
 * @author linahovanessian on 11/7/18.
 */
public class SearchCommitCommand {
    private String command;
    //https://api.github.com/search/commits?q=repo:octocat/Spoon-Knife+css&author:octocat


    public SearchCommitCommand(String repoName, String ownerName) {
    /*    StringBuilder path = new StringBuilder( "repos/:owner/:repo/commits" );
        if ((repoName != null && !repoName.isEmpty()) || (userName != null && !userName.isEmpty())) {
            path.append( "?q=" );
            if (repoName != null && userName != null) {
                path.append( "repo:" ).append( repoName ).append( "&" ).append( "committer:" ).append( userName );
            } else if (userName != null) {
                path.append( "repo:" ).append( repoName );
            } else {
                path.append( "committer:" ).append( userName );
            }
        */
        String path = new String( "/repos/{ownerName}/{repoName}/commits" );
        this.command = path.replace( "{ownerName}", ownerName ).replace( "{repoName}", repoName );
    }

    public String getCommand() {
        return command;
    }
}
