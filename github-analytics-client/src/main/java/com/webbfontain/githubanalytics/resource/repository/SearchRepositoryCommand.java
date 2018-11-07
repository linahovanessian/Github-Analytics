package com.webbfontain.githubanalytics.resource.repository;

/**
 * @author linahovanessian on 11/6/18.
 */
public class SearchRepositoryCommand {

    private String command;

    public SearchRepositoryCommand(String command) {
        StringBuilder path = new StringBuilder( "/search/repositories" );
        if (!command.isEmpty()) {
            path.append( "?q=" ).append( command ).append( "&per_page=100" );
        } else
            path.append( "?per_page=100" );
        this.command = path.toString();
    }

    public String getCommand() {
        return command;
    }


}
