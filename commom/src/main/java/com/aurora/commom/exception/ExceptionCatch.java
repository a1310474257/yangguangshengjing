package com.aurora.commom.exception;


import com.aurora.result.response.Response;
import com.aurora.result.response.ResponseResult;
import com.aurora.result.resultCodeImpl.CommonCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常捕获类
 *
 * 作者：jun
 * 创建时间：2020.5月.29日
 *
 */

@Slf4j
@ControllerAdvice
public class ExceptionCatch {



  @ExceptionHandler(Exception.class)
  @ResponseBody
  public Response SystemException(HttpServletRequest request, Exception e) throws IOException {
//    System.out.println(request.getRequestURI()+" "+request.getParameter("a"));
    //获取请求体中 的参数
    Map<String, String> parameterByHttpServletRequest = getParameterByHttpServletRequest(request);
    System.out.println(parameterByHttpServletRequest);
    e.printStackTrace();
    CommonCode commonCode = CommonCode.FAIL;
    commonCode.setMessage(e.getMessage());
    ResponseResult responseResult = new ResponseResult(commonCode);
    return responseResult;
  }



  /**
   * 从HttpServletRequest中取参数和值
   * @param request
   * @return
   */
  private Map<String,String> getParameterByHttpServletRequest(HttpServletRequest request){
    Map<String,String> parameterMap = new HashMap<>();
    Enumeration em = request.getParameterNames();
    while (em.hasMoreElements()) {
      String name = (String) em.nextElement();
      parameterMap.put(name,request.getParameter(name));
    }
    return parameterMap;
  }



}
