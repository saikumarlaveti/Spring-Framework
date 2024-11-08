package com.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP.xml");
        Student std = context.getBean("student", Student.class);
        System.out.println(std.getName());
        System.out.println(std.getAge());
        //std.printThrowException();
    }
}
