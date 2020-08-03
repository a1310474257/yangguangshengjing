package com.aurora.api.hainancity;

import com.aurora.result.response.ResponseResult;

/**
 * 项目API
 * 作者：jun
 * 创建时间：2020.8月.3日
 */
public interface HainancityApi {

    /**
     * 获得海南所有城市的信息 不需要分页
     * @return
     */
    public ResponseResult getHainancity();

    /**
     * 创建城市
     * @param admin_number 管理员编号
     * @param token 管理员凭证
     * @param city_name 城市名字
     * @param city_temperature 温度
     * @param city_humidity  湿度
     * @param city_houseprice 房价
     */
    public void createCity(String admin_number,String token,String city_name,String city_temperature,String city_humidity,String city_houseprice);
}
