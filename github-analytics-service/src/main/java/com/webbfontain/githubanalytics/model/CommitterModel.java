package com.webbfontain.githubanalytics.model;

import com.webbfontain.githubanalytics.domain.Committer;

/**
 * @author linahovanessian on 11/7/18.
 */
public class CommitterModel {

    private Committer committer;
    private long commitCount;
    private String email;
    private String avatar;


    public CommitterModel(Committer committer, long commitCount) {
        this.committer = committer;
        this.commitCount = commitCount;
    }

    public CommitterModel(String avatar, long commitCount) {
        this.commitCount = commitCount;
        this.avatar = avatar;
    }

    public Committer getCommitter() {
        return committer;
    }

    public CommitterModel setCommitter(Committer committer) {
        this.committer = committer;
        return this;
    }

    public long getCommitCount() {
        return commitCount;
    }

    public CommitterModel setCommitCount(long commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CommitterModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public CommitterModel setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
}
