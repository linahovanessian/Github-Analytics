package com.webbfontain.githubanalytics.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Map;

/**
 * @author linahovanessian on 11/6/18.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Repository {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("url")
    private String url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_at")
    private Date createdAt;

    private String ownerName;

    @JsonProperty("owner")
    private void unpackNameFromNestedObject(Map<String, String> owner) {
        this.ownerName = owner.get( "login" );
    }


    public String getOwnerName() {
        return ownerName;
    }

    public Repository setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Repository setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Repository setName(String name) {
        this.name = name;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Repository setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Repository setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Repository setDescription(String description) {
        this.description = description;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Repository setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
/*
"id": 3081286,
        "node_id": "MDEwOlJlcG9zaXRvcnkzMDgxMjg2",
        "name": "Tetris",
        "full_name": "dtrupenn/Tetris",
        "owner": {
        "login": "dtrupenn",
        "id": 872147,
        "node_id": "MDQ6VXNlcjg3MjE0Nw==",
        "avatar_url": "https://secure.gravatar.com/avatar/e7956084e75f239de85d3a31bc172ace?d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png",
        "gravatar_id": "",
        "url": "https://api.github.com/users/dtrupenn",
        "received_events_url": "https://api.github.com/users/dtrupenn/received_events",
        "type": "User"
        },
        "private": false,
        "html_url": "https://github.com/dtrupenn/Tetris",
        "description": "A C implementation of Tetris using Pennsim through LC4",
        "fork": false,
        "url": "https://api.github.com/repos/dtrupenn/Tetris",
        "created_at": "2012-01-01T00:31:50Z",
        "updated_at": "2013-01-05T17:58:47Z",
        "pushed_at": "2012-01-01T00:37:02Z",
        "homepage": "",
        "size": 524,
        "stargazers_count": 1,
        "watchers_count": 1,
        "language": "Assembly",
        "forks_count": 0,
        "open_issues_count": 0,
        "master_branch": "master",
        "default_branch": "master",
        "score": 10.309712*/
