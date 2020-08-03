package com.aurora.api.houestype;

import com.aurora.result.response.Response;
import com.aurora.result.response.ResponseResult;

/**
 * 项目API
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface Houestype {

    /**
     * 获取所有户型图
     * @param pageNumber
     * @param pageSize
     * @return
     */
    public ResponseResult getAllHousetype(Integer pageNumber,Integer pageSize);

    /**
     * 删除一个户型图
     * @param ht_number 户型图编号
     * @return
     */
    public Response deleteHoustype(String ht_number);

    /**
     * 管理员更新某个户型图  根据管理员编号来更新
     * @param admin_number 管理员编号
     * @param token 管理员访问凭证
     * @param ht_number 户型图编号
     * @param ht_name   户型图名称
     * @param ht_area   户型图地址
     * @param ht_image  户型图图片地址
     * @param ht_sales  参考售价
     * @param ht_desctiption  户型图简介
     * @param py_category_name 户型图分类
     * @return
     */
    public Response updateHoustype(String admin_number,String token, String ht_number,String ht_name,String ht_area,String ht_image,String ht_sales,String ht_desctiption,String py_category_name);


    /**
     * 保存一个户型图
     * @param admin_number 管理员编号
     * @param token 管理员访问凭证
     * @param ht_name   户型图名称
     * @param ht_area   户型图地址
     * @param ht_image  户型图图片地址
     * @param ht_sales  参考售价
     * @param ht_desctiption  户型图简介
     * @param py_category_name 户型图分类
     * @return
     */
    public Response createHoustype(String admin_number,String token,String ht_name,String ht_area,String ht_image,String ht_sales,String ht_desctiption,String py_category_name);

    /**
     * 创建一个户型图分类
     * @param admin_number  管理员编号
     * @param token  管理员访问凭证
     * @param category_name 分类名称
     * @return
     */
    public Response createCategory(String admin_number,String token, String category_name);

    /**
     * 根据id删除分类
     * @param admin_number 管理员编号
     * @param token 管理员访问凭证
     * @param id 分类id
     * @return
     */
    public Response deleteCategory(String admin_number,String token, Integer id);

    /**
     * 查询所有分类
     * @return
     */
    public ResponseResult getCategory();

    /**
     * 根据id修改该分类
     * @param admin_number 管理员编号
     * @param token 管理员访问凭证
     * @param category_name 分类名称
     * @param id 分类id
     * @return
     */
    public Response updateCategory(String admin_number,String token,  String category_name, Integer id);


    /**
     * 根据户型图的分类查询所有的户型图
     * @param category_name
     * @return
     */
    public ResponseResult getHousetypeByCategory_name(String category_name);
}
