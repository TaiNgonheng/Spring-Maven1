// package com.Tai_Ngonheng.Learn_Spring_Framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringHello {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("Address"));
        System.out.println(context.getBean("information2"));
        System.out.println(context.getBean("person2method"));
        System.out.println(context.getBean(test.class));
        System.out.println(context.getBean("paramenter"));
    }
}
