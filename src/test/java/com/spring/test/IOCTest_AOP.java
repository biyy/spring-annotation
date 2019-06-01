package com.spring.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.MathCalculator;
import com.spring.bean.Boss;
import com.spring.bean.Car;
import com.spring.bean.Color;
import com.spring.bean.Red;
import com.spring.config.MainConfigOfAOP;
import com.spring.config.MainConifgOfAutowired;
import com.spring.dao.BookDao;
import com.spring.service.BookService;

public class IOCTest_AOP {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
		
		//1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
		
		mathCalculator.div(1, 0);
		
		applicationContext.close();
	}

}
