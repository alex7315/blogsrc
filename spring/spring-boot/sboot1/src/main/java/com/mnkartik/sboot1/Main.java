package com.mnkartik.sboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
@Component
@ComponentScan
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
