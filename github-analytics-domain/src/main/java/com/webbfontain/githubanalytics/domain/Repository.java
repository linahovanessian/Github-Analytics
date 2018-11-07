package com.webbfontain.githubanalytics.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    @JsonProperty("html_url")
    private String url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_at")
    private String createdAt;

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

    public String getCreatedAt() {
        return createdAt;
    }

    public Repository setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
