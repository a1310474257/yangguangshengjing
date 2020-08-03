package com.aurora.api.login;

import com.aurora.model.wx.Openid;

/**
 * 登录API
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface LoginApi {
    /**
     * 获取微信的openid
     * @param code  获取openid的凭证
     * @return
     * @throws Exception
     */
    public Openid getOpenid(String code) throws Exception;
}
