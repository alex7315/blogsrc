package com.mnkartik.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		new Main().init();
	}

	public void init() {

		// loading the configuration 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-config.xml");
		// this is important to set which profile tagged beans are to be loaded
		context.getEnvironment().setActiveProfiles("test");
		context.refresh();

		// get the bean and use it 
		Person p = context.getBean(Person.class);

		System.out.println(p.getValue());

		context.close();
	}

}
