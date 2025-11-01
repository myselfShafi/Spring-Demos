package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        xmlContainer();
        jbcContainer();
    }

    static void xmlContainer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_context.xml");

        User u1 = (User) context.getBean("user");
        u1.setName("shafi");

        System.out.println(u1.getName());
    }

    static void jbcContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext();
    }
}
