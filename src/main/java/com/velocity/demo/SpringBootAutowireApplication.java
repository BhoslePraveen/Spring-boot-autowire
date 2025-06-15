package com.velocity.demo;

import com.velocity.demo.constructor.ReportService;
import com.velocity.demo.constructor.ReportService2;
import com.velocity.demo.field.EmployeeService;
import com.velocity.demo.setter.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAutowireApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAutowireApplication.class, args);
	}

}
