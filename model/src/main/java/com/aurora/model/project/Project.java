package com.aurora.model.project;

import com.aurora.model.entity.PrProject;
import com.aurora.model.entity.PrSalescenter;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 项目信息bean
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
@Data
@ToString
public class Project{
       private PrProject prProject;
       private List <PrSalescenter> salesCentersList; //销售中心
       private List<String> rotationsImagesList;//轮播图
       private List<String> introductionImagesList;//介绍图片

}
