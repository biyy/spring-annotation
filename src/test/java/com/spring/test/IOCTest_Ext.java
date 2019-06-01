package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.MathCalculator;
import com.spring.bean.Boss;
import com.spring.bean.Car;
import com.spring.bean.Color;
import com.spring.bean.Red;
import com.spring.config.MainConfigOfAOP;
import com.spring.config.MainConifgOfAutowired;
import com.spring.dao.BookDao;
import com.spring.ext.ExtConfig;
import com.spring.service.BookService;

public class IOCTest_Ext {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);
		
		
		//发布事件；
		applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
		});
		
		applicationContext.close();
	}

}
