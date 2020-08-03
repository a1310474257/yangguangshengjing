package com.aurora.web.service.login;

import com.aurora.model.wx.Openid;

import java.io.IOException;
import java.text.ParseException;

public interface LoginServer  {
    Openid getOpenid(String js_code) throws IOException, ParseException;
}
