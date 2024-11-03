package com.BeanLifeCycle;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLife {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
//        Student s = context.getBean("Life",Student.class);
//        System.out.println(s.getName());
//        context.registerShutdownHook();

        Student2 s2 = context.getBean("Life2",Student2.class);
        System.out.println(s2.getName());
        context.registerShutdownHook();
    }
}
