package com.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class,
				args);

		for (String name : applicationContext.getBeanDefinitionNames()) { // Prints all the beans present in the
																			// application
			System.out.println(name);
		}
	}

}
