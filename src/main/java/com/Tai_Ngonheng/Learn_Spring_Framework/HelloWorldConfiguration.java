package com.Tai_Ngonheng.Learn_Spring_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
     return "Watermelon";
    }

}
