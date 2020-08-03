package com.aurora.commom.exception;

import com.aurora.result.ResultCode;

/**
 * 异常抛出类
 * 作者：jun
 * 创建时间：2020.5月.29日
 *
 */
public class ExceptionCast {

    /**
     * 抛出我的异常
     * @param resultCode
     */
    public static void CommomException(ResultCode resultCode){
        throw  new CommomException(resultCode);
    }



}