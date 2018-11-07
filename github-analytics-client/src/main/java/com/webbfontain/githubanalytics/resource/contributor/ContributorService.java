package com.webbfontain.githubanalytics.resource.contributor;

import com.webbfontain.githubanalytics.domain.ContributorList;

/**
 * @author linahovanessian on 11/6/18.
 */
public interface ContributorService {

    ContributorList getProjectContributorList(GetContributorsCommand contributorsCommand);
}
