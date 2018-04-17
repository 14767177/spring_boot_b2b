package com.casic.aop.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSON;



public class InterAccessInterceptor extends HandlerInterceptorAdapter {
	
	//@Value("${Expiration_DATE}")
	private int Expiration_DATE = 60;
	//@Value("${FREQUENCY}")
	private Long  FREQUENCY = 5L;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		/*HandlerMethod handlerMethod = null;
		if(handler instanceof HandlerMethod){
			handlerMethod = (HandlerMethod) handler;
			InterAccessRequired loginRequired = handlerMethod.getMethod()
					.getAnnotation(InterAccessRequired.class);
			if(loginRequired == null){
				return true;
			}
			//接口校验 
			System.out.println(Expiration_DATE );
			System.out.println(FREQUENCY );
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("success", false);
			String uri = request.getRequestURI().toString();
			String ip = request.getRemoteAddr();
			String redisKey = "limit-ip-request:" + uri + ":" + ip;
			Long count = RedisUtils.getClient().incr(redisKey);
			System.out.println(redisKey);
			System.out.println(count+"----------------次数");
			if(count==1){
				RedisUtils.getClient().expire(redisKey, Expiration_DATE);
			}
			if (count > FREQUENCY) {
				map.put("message", "访问次数过多，请稍后再试");
				String jsonString = JSON.toJSONString(map);
				System.out.println(jsonString);
				response.setHeader("Content-type", "text/html;charset=UTF-8"); 
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(jsonString);	
				return false;
			}
		}*/
		return true;
	}

	
}
