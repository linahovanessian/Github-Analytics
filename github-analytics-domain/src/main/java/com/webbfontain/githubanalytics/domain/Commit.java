package com.webbfontain.githubanalytics.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author linahovanessian on 11/6/18.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Commit {

    @JsonProperty("html_url")
    private String url;
    @JsonProperty("sha")
    private String sha;
    @JsonProperty("committer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Committer committer;


    public Committer getCommitter() {
        return committer;
    }

    public Commit setCommitter(Committer committer) {
        if (committer == null) {//???? not sure why we have null value for committer
            this.committer = new Committer();
        } else
            this.committer = committer;
        return this;
    }


    public String getUrl() {
        return url;
    }

    public Commit setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getSha() {
        return sha;
    }

    public Commit setSha(String sha) {
        this.sha = sha;
        return this;
    }


}
