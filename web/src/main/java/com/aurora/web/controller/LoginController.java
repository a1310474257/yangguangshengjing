package com.aurora.web.controller;

import com.aurora.api.login.LoginApi;
import com.aurora.model.wx.Openid;
import com.aurora.web.service.login.LoginServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 登录
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
@RestController
@RequestMapping("/login")
@Api(value = "login",description = "登录接口")
public class LoginController implements LoginApi {

    @Autowired
    LoginServer loginServer;
    /**
     * 获取openid
     * @return
     */
    @GetMapping("/getOpenid")
    @ApiOperation("根据code获取openid")
    @Override
    public Openid getOpenid(String code) throws Exception {
        Openid openid = loginServer.getOpenid(code);
        return openid;
    }
}
