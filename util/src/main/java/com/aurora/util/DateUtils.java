package com.aurora.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
   private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 字符串转时间
     * @param str
     * @return
     */
    public static Date strToTime(String str){
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    /**
     * 时间转字符串
     * @param time
     * @return
     */
    public static String timeToString(Date time){
        return sdf.format(time);
    }
}
