package com.webbfontain.githubanalytics.controller;

import com.webbfontain.githubanalytics.domain.CommitList;
import com.webbfontain.githubanalytics.domain.Contributor;
import com.webbfontain.githubanalytics.domain.Repository;
import com.webbfontain.githubanalytics.resource.commit.SearchCommitCommand;
import com.webbfontain.githubanalytics.resource.contributor.GetContributorsCommand;
import com.webbfontain.githubanalytics.resource.repository.SearchRepositoryCommand;
import com.webbfontain.githubanalytics.service.GithubApiClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author linahovanessian on 11/6/18.
 */
@RestController
@RequestMapping("/github")

public class GithubController {

    @Autowired
    GithubApiClientService githubApiClientService;


    @RequestMapping("")
    public ModelAndView welcome() {
        ModelAndView model = new ModelAndView( "home" );
        model.addObject( "message", "Hello Lina" );

        return model;

    }

    @GetMapping(path = "/repositories", produces = "application/json")
    public ModelAndView getPublicRepositories(@RequestParam("query") String query) {
        ModelAndView model = new ModelAndView( "repository" );
        List<Repository> repositories = githubApiClientService.searchPublicRepositories( new SearchRepositoryCommand(
                query ) )
                .getRepositories();

        model.addObject( "repositories", repositories );
        return model;
    }


    @GetMapping(path = "/committers/{ownerName}/{repoName}", produces = "application/json")
    public List<Contributor> getProjectCommitters(@PathVariable("repoName") String repoName,
                                                  @PathVariable("ownerName") String ownerName) {
        return githubApiClientService.getProjectContributorList( new GetContributorsCommand( ownerName, repoName
        ) );

    }

    @GetMapping(path = "/commits/{repoName}/{ownerName}",
            produces = "application/json")
    public CommitList getCommits(

            @PathVariable("repoName") String repoName,
            @PathVariable("ownerName") String ownerName) {

        return githubApiClientService.getCommits( new SearchCommitCommand( repoName, ownerName
        ) );

    }


}
