package com.webbfontain.githubanalytics.resource.repository;

import com.webbfontain.githubanalytics.domain.RepositoryList;
import com.webbfontain.githubanalytics.resource.Command;

/**
 * @author linahovanessian on 11/6/18.
 */
public interface RepositoryService {


    RepositoryList searchPublicRepositories(Command command);
}
