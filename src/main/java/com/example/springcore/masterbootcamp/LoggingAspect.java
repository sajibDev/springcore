package com.example.springcore.masterbootcamp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("within(*.*.*.*.*)")
    public void allMethod( JoinPoint jp){
        System.err.println("Value of jp argument:::"+jp.getArgs()[0].toString());
    }

    @Before("allMethod(..)")
    public void beforePointcut(){
        System.err.println("Before method is called");
    }

    @After("allMethod(..)")
    public void after(){
        System.err.println("After method is called");
    }

}
