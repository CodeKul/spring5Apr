package com.codekul.spring5Apr.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAop {

    @Before("execution(* com.codekul.spring5Apr.jpa.controller.UserController.saveUser(..))") // pointcut expression
    public void loginActivity(){
        System.out.println("login activity");
    }
}
