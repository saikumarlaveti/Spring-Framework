package com.autowiring.Byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameAutowiring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ByName.xml");
        Saikumar object = context.getBean("saikumar", Saikumar.class);
        object.display();
    }
}
