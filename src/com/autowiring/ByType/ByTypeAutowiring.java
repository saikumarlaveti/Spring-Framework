package com.autowiring.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByTypeAutowiring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ByType.xml");
        Saikumar object = context.getBean("saikumar", Saikumar.class);
        object.display();
    }
}
