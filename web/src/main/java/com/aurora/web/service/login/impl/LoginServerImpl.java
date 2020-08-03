package com.aurora.web.service.login.impl;

import com.alibaba.fastjson.JSONObject;
import com.aurora.model.wx.Openid;
import com.aurora.util.HttpClient;
import com.aurora.web.service.login.LoginServer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.text.ParseException;

@Transactional
@Service
public class LoginServerImpl implements LoginServer {

    private static String appid = "wxea6a6879ed374b1d";
    private static String secret = "890694759d6880051bc872493e4581d9";
    private static String openidRequestUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=wxea6a6879ed374b1d&secret=890694759d6880051bc872493e4581d9&js_code=JSCODE&grant_type=authorization_code";
    @Override
    public Openid getOpenid(String js_code) throws IOException, ParseException {
        String url = this.openidRequestUrl;
        url = url.replace("JSCODE",js_code);
        System.out.println(url);
        HttpClient client = new HttpClient(url);
        client.get();
        String content = client.getContent();
        JSONObject jsonObject = JSONObject.parseObject(content);
        String openid = (String) jsonObject.get("openid");

        Openid openid1 = new Openid(openid);
        if(openid==null){
            System.out.println(content);
        }
        return openid1;
    }
}
