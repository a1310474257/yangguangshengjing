package com.aurora.api.project;

import com.aurora.model.project.Project;
import com.aurora.result.response.Response;
import com.aurora.result.response.ResponseResult;

/**
 *
 * 项目只有一个 所有我不写新增记录了 这做修改 和查询
 * 项目API
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface ProjectApi {
    /**
     * 根据项目编号获取信息
     * @param projectNumber 项目编号
     * @return
     */
   public ResponseResult getProject(String projectNumber);

    /**
     *  根据项目编号  项目编号在 Project类里面  这里的更新 需要你把  例如你要把 图片数组list 变成 “ 图片1,图片2,图片3 ”这样的字符串再存入数据库 参考 getproject的实现方式
     * @param Project
     * @return
     */
   public ResponseResult updateProject(String admin_number ,String token,  Project Project);


}
