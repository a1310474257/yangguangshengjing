package com.aurora.web.controller;

import com.aurora.model.project.Project;
import com.aurora.result.response.ResponseResult;
import com.aurora.result.response.query.QueryResponseResult;
import com.aurora.result.resultCodeImpl.CommonCode;
import com.aurora.web.service.security.AccessControlService;
import com.aurora.web.service.security.impl.AccessControlServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 测试
 */
@RestController
@RequestMapping("/test")
@Api(value = "用户管理",description = "提供增删查改")
public class test {
    private String imagePath = "E:\\nginx\\ygcj\\image\\housetype\\";
    @Autowired
    private AccessControlService accessControlService;
    @GetMapping("/test")
    @ApiOperation("test")
    public ResponseResult test(String page_number){
        Boolean aBoolean = accessControlService.userUpdateLimit(page_number);
        System.out.println(aBoolean);
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("adasda");
//        arrayList.add("ssss");
//        ResponseResult responseResult = new QueryResponseResult(CommonCode.SUCCESS,project);
//        return responseResult;
        return null;
    }

    @PostMapping("/upload")
    @ApiOperation("上传测试")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
//        String filePath = "/Users/itinypocket/workspace/temp/";
        File dest = new File(imagePath + fileName);
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IOException e) {
        }
        return "上传失败！";
    }

}
