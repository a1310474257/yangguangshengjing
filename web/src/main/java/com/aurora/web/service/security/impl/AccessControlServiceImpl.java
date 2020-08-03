package com.aurora.web.service.security.impl;

import com.aurora.web.service.security.AccessControlService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 访问控制服务类 一般在用户提交表单时使用
 */
@Service
@Transactional
public class AccessControlServiceImpl implements AccessControlService {

    private Map<String, Date> userAcccessControl = new HashMap<>();
    private Integer limitTime = 20;  //限制的时间
    /**
     * 用户使用更新接口的限制，注意场景使用。一定是用户自己提交的信息才进行限制
     * 尽量的返回true
     * @param userPagenumber 用户编号
     * @return
     */
    @Override
    public Boolean userUpdateLimit(String userPagenumber) {
        try {
            Date date = userAcccessControl.get(userPagenumber);
            Date currentDate = new Date();
            /**
             * 1、该用户第一次访问接口 放行
             */
            if (date == null){
                userAcccessControl.put(userPagenumber,currentDate);
                return true;
            }else{
                long times = date.getTime()+limitTime*1000; //上次访问的时间戳+20s
                long time = currentDate.getTime();  //当前时间戳
                /**
                 * 如果访问的时间间隔已经大于20s 放行
                 */
                if (time>times){
                    userAcccessControl.put(userPagenumber,currentDate);
                    return true;
                }else {
                    return false;
                }
            }
        }catch (Exception e){
            return true;
        }

    }
}
