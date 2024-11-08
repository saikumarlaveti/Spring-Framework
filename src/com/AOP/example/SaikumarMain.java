package com.AOP.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaikumarMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SaikumarAop.xml");
        Saikumar obj = context.getBean("saikumar", Saikumar.class);
        System.out.println(obj.getStudent());
    }
}
