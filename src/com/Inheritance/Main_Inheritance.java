package com.Inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Inheritance {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Inheritance.xml");
        Parent pare = context.getBean("parentClass", Parent.class);

        System.out.println(pare.getMessage1());
        System.out.println(pare.getMessage2());

        Child chi = context.getBean("childClass",Child.class);
        System.out.println(chi.getMessage1());
        System.out.println(chi.getMessage2());
        System.out.println(chi.getMessage3());
        System.out.println(chi.getMessage4());

    }
}