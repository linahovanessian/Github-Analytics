package com.webbfontain.githubanalytics.controller;

import com.webbfontain.githubanalytics.domain.Commit;
import com.webbfontain.githubanalytics.domain.Repository;
import com.webbfontain.githubanalytics.model.CommitterModel;
import com.webbfontain.githubanalytics.resource.commit.SearchCommitCommand;
import com.webbfontain.githubanalytics.resource.repository.SearchRepositoryCommand;
import com.webbfontain.githubanalytics.service.GithubApiClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

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
    public ModelAndView getProjectCommitters(@PathVariable("repoName") String repoName,
                                             @PathVariable("ownerName") String ownerName) {
        ModelAndView model = new ModelAndView( "contributors" );
       /* List<Contributor> contributors = githubApiClientService.getProjectContributorList( new GetContributorsCommand(
                ownerName,
                repoName
        ) );*/

        List<Commit> commits = githubApiClientService.getCommits( new SearchCommitCommand( repoName, ownerName ) );
        List<CommitterModel> contributors = commits.stream().collect(
                groupingBy( Commit::getLoginAvatar, Collectors.counting() )
        ).entrySet().stream().map( (e) -> new CommitterModel( e.getKey(), e.getValue() )
        ).sorted( Comparator.comparingLong( CommitterModel::getCommitCount ).reversed() )
                .collect( Collectors.toList() );
        model.addObject( "contributors", contributors );
        model.addObject( "repoName", repoName );
        model.addObject( "ownerName", ownerName );
        return model;

    }

    @GetMapping(path = "/commits/{repoName}/{ownerName}",
            produces = "application/json")
    public ModelAndView getCommits(

            @PathVariable("repoName") String repoName,
            @PathVariable("ownerName") String ownerName) {
        ModelAndView model = new ModelAndView( "commits" );
        List<Commit> commits = githubApiClientService.getCommits( new SearchCommitCommand( repoName, ownerName
        ) );
        model.addObject( "commits", commits );
        model.addObject( "repoName", repoName );
        model.addObject( "ownerName", ownerName );
        return model;

    }


}
