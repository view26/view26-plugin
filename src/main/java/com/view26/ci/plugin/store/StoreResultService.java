package com.view26.ci.plugin.store;

import com.view26.ci.plugin.exception.StoreResultException;
import com.view26.ci.plugin.model.SubmittedResult;
import hudson.model.AbstractProject;

/**
 * @author aneeshia
 */
public interface StoreResultService {
  /**
   * Store result
   *
   * @param project
   * @param result
   * @return
   * @throws StoreResultException
   */
  Boolean store(AbstractProject project, final SubmittedResult result) throws StoreResultException;

  /**
   * Load all result
   *
   * @param request
   * @return
   * @throws StoreResultException
   */
  ReadSubmitLogResult fetchAll(ReadSubmitLogRequest request)
    throws StoreResultException;

  /**
   * Fetch with paging and search from file.
   *
   * @param request
   * @return
   * @throws StoreResultException
   */
  ReadSubmitLogResult fetch(ReadSubmitLogRequest request)
    throws StoreResultException;
}
