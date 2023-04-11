package com.codekul.spring5Apr.config;

import com.codekul.spring5Apr.beanscope.Car;
import com.codekul.spring5Apr.beanscope.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.codekul.spring5Apr.ioc")
public class AppConfig {

    @Bean
    //@Scope(value = "singleton")
    public Vehicle getVehicle(){
        return new Vehicle();
    }

    @Bean
    @Scope(value = "prototype")
    public Car getCar(){
        return new Car();
    }
}
