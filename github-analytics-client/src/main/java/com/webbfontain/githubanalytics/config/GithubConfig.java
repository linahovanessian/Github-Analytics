package com.webbfontain.githubanalytics.config;

/**
 * @author linahovanessian on 11/6/18.
 */
public class GithubConfig {

    public static String USERNAME = "username";
    public static String PASSWORD = "password";


    private String username;
    private String password;

    GithubConfig(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
