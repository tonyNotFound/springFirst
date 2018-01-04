package com.deep.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/deep/spring/aop/bean.xml");
		Camera camera = (Camera) context.getBean("camera");
		
		camera.snap();
		
	}

}
