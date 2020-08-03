package com.aurora.web.service.security;



/**
 *  PrSalescenter表dao层
 * 作者：jun
 * 创建时间：2020.8月.2日
 */
public interface AccessControlService {

    /**
     * 用户使用更新接口的限制，注意场景使用。一定是用户自己提交的信息才进行限制
     * @param userPagenumber 用户编号
     * @return
     */
    public Boolean userUpdateLimit(String userPagenumber);
}
