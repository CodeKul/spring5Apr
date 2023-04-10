package com.codekul.spring5Apr;

import com.codekul.spring5Apr.config.AppConfig;
import com.codekul.spring5Apr.ioc.StudentImpl;
import com.codekul.spring5Apr.ioc.SchoolService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring5AprApplication {

	public static void main(String[] args) {
		//used to create an object for application context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SchoolService schoolService = context.getBean(StudentImpl.class);
		schoolService.doWork();

		//SpringApplication.run(Spring5AprApplication.class, args);
	}

}
