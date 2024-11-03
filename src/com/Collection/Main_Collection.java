package com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Properties;


public class Main_Collection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Collection.xml");
        Student std = context.getBean("student",Student.class);
        System.out.println("List Values");
        System.out.println(std.getStudentNames());
        System.out.println("Set Values");
        System.out.println(std.getCountryNames());
        System.out.println("Map Values");
        System.out.println(std.getTopCities());
        System.out.println("Properties Values");
        Properties s = std.cash;
        System.out.println(s);
    }
}
