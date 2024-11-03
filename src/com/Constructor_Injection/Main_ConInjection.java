package com.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_ConInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Const_Injection.xml");
        Teacher teacher = context.getBean("teacher",Teacher.class);
        teacher.speck();
    }
}
