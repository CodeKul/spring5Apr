package com.codekul.spring5Apr;

import com.codekul.spring5Apr.beanscope.Car;
import com.codekul.spring5Apr.beanscope.Vehicle;
import com.codekul.spring5Apr.config.AppConfig;
import com.codekul.spring5Apr.di.Student;
import com.codekul.spring5Apr.ioc.StudentImpl;
import com.codekul.spring5Apr.ioc.SchoolService;
import com.codekul.spring5Apr.ioc.TeacherImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring5AprApplication {

	public static void main(String[] args) {

		SpringApplication.run(Spring5AprApplication.class, args);

		//used to create an object for application context
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		SchoolService schoolService = context.getBean(StudentImpl.class);
//		schoolService.doWork();
//		schoolService = context.getBean(TeacherImpl.class);
//		schoolService.doWork();
//
//		Vehicle v1 = context.getBean(Vehicle.class);
//		System.out.println("V1: "+v1.hashCode());
//		Vehicle v2 = context.getBean(Vehicle.class);
//		System.out.println("V2: "+v2.hashCode());
//		Vehicle v3 = context.getBean(Vehicle.class);
//		System.out.println("V3: "+v3.hashCode());
//
//		Car c1 = context.getBean(Car.class);
//		System.out.println("C1: "+c1.hashCode());
//		Car c2 = context.getBean(Car.class);
//		System.out.println("C2: "+c2.hashCode());
//
//		Car c3 = context.getBean(Car.class);
//		System.out.println("C3: "+c3.hashCode());

//		Student student = context.getBean(Student.class);
	//	context.close();

	}

}
