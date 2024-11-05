package com.EventHandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEvent {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Event.xml");
        context.start();
        Student student = context.getBean("student",Student.class);
        System.out.println(student.getMessage());
        context.stop();
    }
}
