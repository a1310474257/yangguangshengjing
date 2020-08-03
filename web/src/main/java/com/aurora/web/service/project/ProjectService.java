package com.aurora.web.service.project;

import com.aurora.model.project.Project;

/**
 * 项目信息服务类接口
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface ProjectService {
    /**
     * 根据项目编号查询项目信息
     * @param projectNumber
     * @return
     */
    public Project findProjectByPojectNumber(String projectNumber);
}
