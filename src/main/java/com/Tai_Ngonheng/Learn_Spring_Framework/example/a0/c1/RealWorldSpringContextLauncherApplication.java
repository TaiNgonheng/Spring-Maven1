package com.Tai_Ngonheng.Learn_Spring_Framework.example.a0.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
@ComponentScan

public class RealWorldSpringContextLauncherApplication {
    public static void main(String[] args){
        System.out.println("Hello world");
       try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)){
           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
           System.out.println(context.getBean(BusinessCalculationService.class).findMax());
       }
    }
}
