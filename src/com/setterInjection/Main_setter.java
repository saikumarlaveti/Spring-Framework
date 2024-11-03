package com.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_setter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter_injection.xml");
        Saikumar st = context.getBean("sai", Saikumar.class);
        st.details();
    }
}
