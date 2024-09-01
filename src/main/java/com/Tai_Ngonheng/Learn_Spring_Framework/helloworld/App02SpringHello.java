package com.Tai_Ngonheng.Learn_Spring_Framework;

import com.Tai_Ngonheng.Learn_Spring_Framework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringHello {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
        }
        System.out.println("hello world");
    }
}
