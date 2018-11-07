package com.webbfontain.githubanalytics.resource.commit;

import com.webbfontain.githubanalytics.domain.CommitList;

/**
 * @author linahovanessian on 11/7/18.
 */
public interface CommitService {


    CommitList getCommits(SearchCommitCommand searchCommitCommand);
}
