package com.aurora.api.user;

import com.aurora.result.response.Response;
import com.aurora.result.response.ResponseResult;

/**
 * 用户api
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface UserApi {

    /**
     * 根据openid 获取用户信息  如果该用户没有就创建一个
     * @param openid    微信唯一身份id
     * @param secret   创建用户秘钥  统一为：Fafsaf1saJJHHHHHDFJ3L4NTKJNTKGHS  写在代码里进行验证
     * @return
     */
    public ResponseResult getUserByOpenid(String openid, String secret);

}
