package com.aurora.commom.exception;

import com.aurora.result.ResultCode;

/**
 * 自定义异常类
 * 作者：jun
 * 创建时间：2020.5月.29日
 *
 */
public class CommomException extends RuntimeException {
    private ResultCode resultCode;
    public CommomException(ResultCode resultCode) {
        super("错误代码: "+resultCode.code()+"  错误信息: "+resultCode.message());
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode(){
        return this.resultCode;
    }

}
