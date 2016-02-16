package com.mnkartik.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Main.class,
				args);

		Main mainObj = ctx.getBean(Main.class);

		mainObj.init();

		System.out.println("Application exited");
	}

	public void init() {
		System.out.println("inside init method");
	}

}
