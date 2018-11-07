package com.webbfontain.githubanalytics.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

/**
 * @author linahovanessian on 11/6/18.
 */
@JsonRootName("total_count")
public class RepositoryList {
    int totalCount;

    @JsonProperty("items")
    List<Repository> repositories;

    public RepositoryList() {

    }

    public RepositoryList(int totalCount, List<Repository> repositories) {
        this.totalCount = totalCount;
        this.repositories = repositories;
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public RepositoryList setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
        return this;
    }
}
