package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
        Person obj = context.getBean("beanObj1",Person.class);
        obj.setName("Saikumar Laveti");
        String name = obj.getName();
        System.out.println(name); //Saikumar Laveti

        Person obj1 = context.getBean("beanObj1",Person.class);
        System.out.println(obj1.getName()); // Saikumar Laveti

    }
}
