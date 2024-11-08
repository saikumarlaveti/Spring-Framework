package com.AOP.example;

import org.aspectj.lang.annotation.*;

@Aspect
public class SaiLogging {
    SaiLogging(){
        System.out.println("hello ");
    }
    @Pointcut("execution(* com.AOP.example.*.*(..))")
    public void working(){

    }
    @Before("working( )")
    public void breakFast(){
        System.out.println("I am Eating Tiffin");
    }
    @After("working( ) ")
    public void lunch(){
        System.out.println("I am Eating Rice ");
    }
    @AfterReturning("working( )")
    public void finished(){
        System.out.println("finished");
    }
}
