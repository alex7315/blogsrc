package examples.hibernate.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan
//  @SpringBootApplication // you could either use this one single tag instead of the above three
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
