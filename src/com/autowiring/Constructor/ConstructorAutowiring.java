package com.autowiring.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorAutowiring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Constructor.xml");
        Saikumar object = context.getBean("saikumar", Saikumar.class);
        object.display();
    }
}
