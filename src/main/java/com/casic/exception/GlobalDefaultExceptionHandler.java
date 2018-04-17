package com.casic.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 * 1.注解 @ControllerAdvice
 * 2.Class 添加通用方法
 * 3.方法上添加@ExcetionHandler 拦截异常信息
 * 4.如果返回View 方法返回值MV
 * 5.如果返回是String或者Json 添加responseBody注解
 * 
 *  
 * @author LRN
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest request,Exception e){
		e.printStackTrace();
		return "服务器繁忙，请稍后！";
	}
	
}
