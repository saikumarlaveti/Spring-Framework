package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        Student_1 std = context.getBean("first",Student_1.class);
        std.allStudentDeplay();
    }
}
