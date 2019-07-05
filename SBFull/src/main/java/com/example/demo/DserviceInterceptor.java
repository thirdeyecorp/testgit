package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class DserviceInterceptor implements HandlerInterceptor  {
	
		private static final Logger logger = LoggerFactory.getLogger(DserviceInterceptor.class);
	
		@Override
	   public boolean preHandle(
	      HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
			
			logger.error("****************************************"+"PRE HANDLE METHOD INVOKED"+"****************************************");
	      return true;
	   }
	   @Override
	   public void postHandle(
	      HttpServletRequest request, HttpServletResponse response, Object handler, 
	      ModelAndView modelAndView) throws Exception {
		   
		   logger.error("****************************************"+"POST HANDLE METHOD INVOKED"+"****************************************");
		   
	   }
	   
	   @Override
	   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
	      Object handler, Exception exception) throws Exception {
		   
		   logger.error("****************************************"+"AFTER COMPLETION METHOD INVOKED"+"****************************************");
		   
	   }

}
