status : todo

<br>

verion : 3.1+ onwards 

<br>

Usually for any project there are many environements like development, qa, staging and production. Imagine a situation where you have a requirement to load the bean based on the environment and it should be loaded at the run time. So its a conditional decision made at the time of runtime by the spring container. 

This is achieved using the spring `@Profile` annotation, which loads the respective bean as tagged to the environment. 

In this example we are considering `Person` bean ( in real world it would be more complex, it is just for simplicity sake ) which are differently created for each envrioment as shown below. 

<blockquote>
	NOTE: The example uses the spring boot configuration for simplicity but can also use usual spring based dependencies. 
</blockquote>

<br>

Listing-1: DevAppConfig.java

~~~java
// [1]
@Configuration

// [2]
@Profile("dev")
public class DevAppConfig {

    // [3]
	@Bean
	public Person getPersonForDev(){		
		System.out.println("dev bean");
		Person p = new Person();
		p.setValue("this is dev person object");
		return p;
	}
}
~~~

[1]: Here we are using the java based configuration

For simplicity, from above snippet, it returns a `Person` bean which is for the dev environment.





