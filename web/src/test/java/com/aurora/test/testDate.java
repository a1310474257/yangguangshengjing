package com.aurora.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class testDate {

    @Test
    public  void test1() throws ParseException {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sadasd");
        System.out.println(arrayList.toString());
        Object o = JSONObject.toJSON(arrayList);
        System.out.println(o.toString());
        JSONObject jsonObject = JSONObject.parseObject("{"+o.toString()+"}");
        System.out.println(jsonObject.toJSONString());
//        System.out.println("字符串转换成时间:" + strToTime("2020-07-10 23:29:31"));
//
//        System.out.println("把当前时间转换成字符串：" + timeToString(new Date()));

    }

    public Date strToTime(String str){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public String timeToString(Date time){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(time);
    }
}
