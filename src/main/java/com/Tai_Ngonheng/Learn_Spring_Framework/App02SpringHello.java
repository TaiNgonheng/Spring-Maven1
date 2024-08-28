package com.Tai_Ngonheng.Learn_Spring_Framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringHello {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("BMW"));;
        System.out.println(context.getBean("heng"));
    }
}
