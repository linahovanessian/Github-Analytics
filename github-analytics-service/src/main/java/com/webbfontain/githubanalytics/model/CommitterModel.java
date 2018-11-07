package com.webbfontain.githubanalytics.model;

import com.webbfontain.githubanalytics.domain.Committer;

/**
 * @author linahovanessian on 11/7/18.
 */
public class CommitterModel {

    private Committer committer;
    private long commitCount;

    public CommitterModel(Committer committer, long commitCount) {
        this.committer = committer;
        this.commitCount = commitCount;
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
}
