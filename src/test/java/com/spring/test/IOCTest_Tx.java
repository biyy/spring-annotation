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
import com.spring.tx.TxConfig;
import com.spring.tx.UserService;

public class IOCTest_Tx {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(TxConfig.class);
	
		UserService userService = applicationContext.getBean(UserService.class);
		
		userService.insertUser();
		applicationContext.close();
	}

}
