package com.mnkartik.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mnkartik.spring.Person;

@Configuration
@Profile("test")
public class TestAppConfig {

	@Bean		
	public Person getPersonForTest(){
		System.out.println("test bean");
		Person p = new Person();
		p.setValue("this is test person object");
		return p;
	}
	
}
