package com.aurora.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class testJson {
    /**
     * java to  json
     */
    @Test
    public  void test1() {
//        JSONObject object = new JSONObject();
//        object.put("1",1);
//        object.put("2","two");
//        object.put("boolean",true );
//        List<Integer> integers = Arrays.asList(1,2,3);
//        object.put("list",integers);
//        object.put("null",null);
//        System.out.println(object);

//        JSONObject jsonObject = JSONObject.parseObject("    {\n" +
//                "            \"salesCentersList\": [\n" +
//                "            {\n" +
//                "                \"address\":\"售楼处A\",\n" +
//                "                    \"phone\":\"13333333333\"\n" +
//                "            }\n" +
//                "          ]\n" +
//                "        }");
//        System.out.println(jsonObject.toJSONString());


    }

    /**
     * json to java
     */
    @Test
    public  void test2(){
//        JSONObject object = JSONObject
//                .parseObject("{\"boolean\":true,\"string\":\"string\",\"list\":[1,2,3],\"int\":2}");
//        String s = object.getString("string");
//        System.out.println(s);

        //从字符串解析JSON对象
//        JSONObject obj = JSON.parseObject("{\"runoob\":\"菜鸟教程\"}");
////从字符串解析JSON数组
//        JSONArray arr = JSON.parseArray("[\"菜鸟教程\",\"RUNOOB\"]\n");
////将JSON对象转化为字符串
//        String objStr = JSON.toJSONString(obj);
//        System.out.println(objStr);
////将JSON数组转化为字符串
//        String arrStr = JSON.toJSONString(arr);
//        System.out.println(arrStr);
        JSONObject object = JSONObject
                .parseObject("{  \"123\":\"20\", \"1\":\"20\", \"221\":\"20\" }");

        for(String s:object.keySet()){
            System.out.println(object.get(s));
        }
    }

    @Test
    public void testString(){
        String str ="轮播图1";
        String[] split = str.split(",");
        System.out.println(split);
    }
}
