package com.webbfontain.githubanalytics.resource.repository;

import com.webbfontain.githubanalytics.resource.Command;

/**
 * @author linahovanessian on 11/6/18.
 */
public class SearchRepositoryCommand implements Command {

    private String command;

    public SearchRepositoryCommand(String command) {
        StringBuilder path = new StringBuilder( "/search/repositories?q=" );
        path.append( command ).append( "&per_page=100&page=1" );
        this.command = path.toString();

    }

    @Override
    public String getCommand() {
        return command;
    }


}
