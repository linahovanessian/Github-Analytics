package com.webbfontain.githubanalytics.resource.commit;

import com.webbfontain.githubanalytics.domain.CommitList;
import com.webbfontain.githubanalytics.resource.Command;

/**
 * @author linahovanessian on 11/7/18.
 */
public interface CommitService {


    CommitList getCommits(Command command);
}
