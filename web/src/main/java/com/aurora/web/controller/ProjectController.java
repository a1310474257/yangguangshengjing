package com.aurora.web.controller;

import com.aurora.api.project.ProjectApi;
import com.aurora.model.project.Project;
import com.aurora.result.response.ResponseResult;
import com.aurora.result.response.query.QueryResponseResult;
import com.aurora.result.resultCodeImpl.CommonCode;
import com.aurora.web.service.project.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 项目信息控制类
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
@RestController
@Transactional
@RequestMapping("/project")
@Api(value = "project",description = "项目接口")
public class ProjectController implements ProjectApi {


    @Autowired
    private ProjectService projectService;

    /**
     * 根据项目编号获取信息
     *
     * @param projectNumber 项目编号
     * @return
     */
    @Override
    @GetMapping("/getProject")
    @ApiOperation("获取项目信息")
    public ResponseResult getProject(String projectNumber) {
        Project projectByPojectNumber = projectService.findProjectByPojectNumber(projectNumber);
        ResponseResult responseResult = new QueryResponseResult(CommonCode.SUCCESS,projectByPojectNumber);
        return responseResult;
    }

    /**
     * 根据项目编号  项目编号在 Project类里面  这里的更新 需要你把 图片数组写成  图片1,图片2,图片3
     *
     * @param admin_number
     * @param token
     * @param Project
     * @return
     */
    @Override
    public ResponseResult updateProject(String admin_number, String token, Project Project) {
        return null;
    }

}
