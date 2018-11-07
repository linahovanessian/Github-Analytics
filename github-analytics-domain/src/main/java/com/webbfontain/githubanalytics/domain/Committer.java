package com.webbfontain.githubanalytics.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author linahovanessian on 11/7/18.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Committer {
    @JsonProperty("login")
    private String login;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    public String getLogin() {
        return login;
    }

    public Committer setLogin(String login) {
        this.login = login;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Committer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Committer setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
}
