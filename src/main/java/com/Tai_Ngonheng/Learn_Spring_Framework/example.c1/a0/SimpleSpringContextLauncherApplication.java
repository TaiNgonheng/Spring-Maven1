package com.Tai_Ngonheng.Learn_Spring_Framework.example.c1.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class YourBusinessClass{

}
@Component
class Dependency{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan("com/Tai_Ngonheng/Learn_Spring_Framework.example.a0")
public class SimpleSpringContextLauncherApplication {
    public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)){

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println );
    }
  }
}
