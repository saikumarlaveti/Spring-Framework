package com.BeanPreprocessor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Preprocessor.xml");
        Student s1 = context.getBean("hello", Student.class);
        System.out.println(s1.getName());
        context.registerShutdownHook();
    }
}
