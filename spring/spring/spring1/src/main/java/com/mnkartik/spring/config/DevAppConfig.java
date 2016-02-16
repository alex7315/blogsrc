package com.mnkartik.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mnkartik.spring.Person;

// this is javaconfigs
@Configuration
// this is must and based on the set of environments, here dev is used in other example test is used
@Profile("dev")
public class DevAppConfig {

	@Bean
	public Person getPersonForDev(){		
		System.out.println("dev bean");
		Person p = new Person();
		p.setValue("this is dev person object");
		return p;
	}
}
