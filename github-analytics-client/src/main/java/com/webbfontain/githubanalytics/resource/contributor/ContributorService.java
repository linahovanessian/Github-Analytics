package com.webbfontain.githubanalytics.resource.contributor;

import com.webbfontain.githubanalytics.domain.ContributorList;
import com.webbfontain.githubanalytics.resource.Command;

/**
 * @author linahovanessian on 11/6/18.
 */
public interface ContributorService {

    ContributorList getProjectContributorList(Command command);
}
