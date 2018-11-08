package com.webbfontain.githubanalytics.model;

/**
 * @author linahovanessian on 11/7/18.
 */
public class CommitterModel {

    private long commitCount;
    private String loginAvatar;

    private String login;
    private String avatar;


    public CommitterModel(String loginAvatar, long commitCount) {
        String[] arr = loginAvatar.split( "#" );
        this.login = arr[0];
        this.avatar = arr[1];
        this.commitCount = commitCount;
    }

    public long getCommitCount() {
        return commitCount;
    }

    public CommitterModel setCommitCount(long commitCount) {
        this.commitCount = commitCount;
        return this;
    }


    public String getLogin() {
        return login;
    }

    public String getAvatar() {
        return avatar;
    }
}
