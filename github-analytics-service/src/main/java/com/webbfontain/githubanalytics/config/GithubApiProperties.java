package com.webbfontain.githubanalytics.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author linahovanessian on 11/6/18.
 */
@ConfigurationProperties(prefix = "github")
public class GithubApiProperties {

    private Api api;


    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }


    public static class Api {

        private String username;

        private String password;

        public String getUsername() {
            return username;
        }

        public Api setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


}