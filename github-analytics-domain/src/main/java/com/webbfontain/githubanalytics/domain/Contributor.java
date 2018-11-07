package com.webbfontain.githubanalytics.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author linahovanessian on 11/6/18.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contributor {

    @JsonProperty("login")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("contributions")
    private long contributions;

    public String getId() {
        return id;
    }

    public Contributor setId(String id) {
        this.id = id;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Contributor setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public long getContributions() {
        return contributions;
    }

    public Contributor setContributions(long contributions) {
        this.contributions = contributions;
        return this;
    }

    public String getName() {
        return name;
    }

    public Contributor setName(String name) {
        this.name = name;
        return this;
    }
}
