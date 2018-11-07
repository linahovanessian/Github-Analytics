package com.webbfontain.githubanalytics.config;

import java.util.Objects;
import java.util.Properties;

/**
 * @author linahovanessian on 11/6/18.
 */
public class GithubConfigBuilder {

    private String username;
    private String password;

    public GithubConfigBuilder() {
    }

    public GithubConfigBuilder(Properties properties) {
        this.username = properties.getProperty( GithubConfig.USERNAME );
        this.password = properties.getProperty( GithubConfig.PASSWORD );
    }

    public GithubConfigBuilder username(String username) {
        this.username = username;
        return this;
    }

    public GithubConfigBuilder password(String password) {
        this.password = password;
        return this;
    }


    public GithubConfig build() {
        return new GithubConfig(
                Objects.requireNonNull( username, "Please specify github username." ),
                Objects.requireNonNull( password, "Please specify github password." )
        );
    }

}
