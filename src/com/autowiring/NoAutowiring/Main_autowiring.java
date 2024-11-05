package com.autowiring.NoAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_autowiring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("NoAutowiring.xml");
        Saikumar object = context.getBean("saikumar", Saikumar.class);
        object.display();
    }
}
