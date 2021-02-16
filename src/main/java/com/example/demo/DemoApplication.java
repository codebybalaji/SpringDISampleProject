package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		
		// understanding the concepts for Autowired, DI and components in SPring
		
		Aliennn a = context.getBean(Aliennn.class);
		a.show();
		// we use the scope in Bean class for prototype multiple Object creation
		Aliennn a1 = context.getBean(Aliennn.class);
		a1.show();
	}

}