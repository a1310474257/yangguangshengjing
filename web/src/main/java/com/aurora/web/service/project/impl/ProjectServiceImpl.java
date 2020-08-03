package com.aurora.web.service.project.impl;

import com.aurora.model.entity.PrProject;
import com.aurora.model.entity.PrSalescenter;
import com.aurora.model.project.Project;
import com.aurora.web.dao.project.PrProjectDao;
import com.aurora.web.dao.project.PrSalescenterDao;
import com.aurora.web.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目信息服务类
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    PrProjectDao prProjectDao;
    @Autowired
    PrSalescenterDao prSalescenterDao;


    /**
     * 根据项目编号查询项目信息
     * @param projectNumber
     * @return
     */
    @Override
    public Project findProjectByPojectNumber(String projectNumber) {
        //1、查找数据库
        PrProject prProject = prProjectDao.selectByPrimaryKey(projectNumber);
        List<PrSalescenter> prSalescenters = prSalescenterDao.selectAllByprojectNumber(projectNumber);
        //2、设置bean
        Project project = new Project();
        project.setSalesCentersList(prSalescenters);
        project.setPrProject(prProject);
        project.setIntroductionImagesList(strArrToList(prProject.getIntroductionImages()));
        project.setRotationsImagesList(strArrToList(prProject.getRotationImages()));
        return project;
    }

    /**
     * 字符串数组转成list
     * @param str  图片,图片2，图片3
     * @return
     */
    private List<String> strArrToList(String str){
        List<String> list = new ArrayList<>();
        String[] split = str.split(",");
        for (int i = 0 ; i < split.length ; i++){
            list.add(split[i]);
        }
        return list;
    }
}
