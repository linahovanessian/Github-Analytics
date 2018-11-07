package com.webbfontain.githubanalytics.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author linahovanessian on 11/6/18.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Commit {

    @JsonProperty("url")
    private String url;
    @JsonProperty("sha")
    private String sha;
    @JsonProperty("message")
    private String message;
    @JsonProperty("authorName")
    private String authorName;
    @JsonProperty("committerName")
    private String committerName;


    private String commitDate;


    @JsonProperty("committer")
    private void unpackCommitterNameFromNestedObject(Map<String, String> committer) {
        if (committer != null)
            this.committerName = committer.get( "login" );
        else
            this
                    .committerName = "";
    }

    @JsonProperty("author")
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private void unpackAuthorNameFromNestedObject(Map<String, String> author) {
        if (author != null)
            this.authorName = author.get( "login" );
        else
            this.authorName = "";
    }

    @JsonProperty("commit")
    private void unpackMessageFromNestedObject(Map<String, Object> commit) {
        if (commit != null) {
            this.message = commit.get( "message" ).toString();
            this.commitDate = ((Map) (commit.get( "committer" ))).get( "date" ).toString();
        } else {
            message = "";
            commitDate = "";
        }
    }

    public String getCommitDate() {
        return commitDate;
    }

    public Commit setCommitDate(String commitDate) {
        this.commitDate = commitDate;
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

    public String getMessage() {
        return message;
    }

    public Commit setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Commit setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public String getCommitterName() {
        return committerName;
    }

    public Commit setCommitterName(String committerName) {
        this.committerName = committerName;
        return this;
    }


}
