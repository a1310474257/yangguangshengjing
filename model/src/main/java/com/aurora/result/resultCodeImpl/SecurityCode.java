package com.aurora.result.resultCodeImpl;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SecurityCode extends CommonCode {
    public static SecurityCode IP_WRONG = new SecurityCode(false,11000,"IP错误！");
    public static SecurityCode TOKEN_ISNOT_VAILD = new SecurityCode(false,11001,"token失效或者错误！");
    public static SecurityCode TOKEN_IS_NULL = new SecurityCode(false,11002,"token不能为空！");
    public static SecurityCode ID_IS_NULL = new SecurityCode(false,11003,"id不能为空！");
    public SecurityCode(boolean success, int code, String message) {
        super(success,code,message);
    }


}

