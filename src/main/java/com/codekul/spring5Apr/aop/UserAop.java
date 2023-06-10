package com.codekul.spring5Apr.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAop {

    @Before("execution(* com.codekul.spring5Apr.jpa.controller.UserController.login(..))") // pointcut expression
    public void beforeLoginActivity(){
        System.out.println("before login activity");
    }

    @After("execution(* com.codekul.spring5Apr.jpa.controller.UserController.login(..))") // pointcut expression
    public void afterLoginActivity(){
        System.out.println("after login activity");
    }

    @AfterReturning(pointcut = "execution(* com.codekul.spring5Apr.jpa.controller.UserController.getUserById(..))",returning = "userId")
    public void getUser(Object userId){
        System.out.println("After returning "+ userId);
    }

}
