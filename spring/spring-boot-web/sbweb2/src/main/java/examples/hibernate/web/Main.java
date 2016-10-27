package examples.hibernate.web;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
		import org.springframework.boot.builder.SpringApplicationBuilder;
		import org.springframework.boot.web.support.SpringBootServletInitializer;
		import org.springframework.context.annotation.ComponentScan;
		import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan
//  @SpringBootApplication // you could either use this one single tag instead of the above three
public class Main extends SpringBootServletInitializer {  // [1]

	@Override  // [2]
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Main.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
