package com.Tai_Ngonheng.Learn_Spring_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){ };
record address (int firstline, String city){};
record Information (int id, String firstname, String lastname, char gender, String email, String phone_Number ){};
record test(int id, String name){};
record Total(){};

@Configuration
public class HelloWorldConfiguration {

    @Bean (name = "Testt")
    public test Test(){
        return new test(1,"Ngonheng");
    }
    @Bean
    public String name(){
     return "Watermelon";
    }

    @Bean
    public int age(){
        return 19;
    }

    @Bean
    public Person person(String name,int age){
        return new Person(name(),age());

    }

    @Bean
    public address Address(){
        return new address(120801,"sensok");

    }

    @Bean (name = "information2")
    public Information information(){
        return new Information(1,"Tai","Ngonheng",'M',"heng68807@gmail.com","0962738305");
    }

    @Bean
    public Person person2method(){
        return new Person(name(),age());
    }


    @Bean
    public Person paramenter(String name, int age){
       return new Person(name(),age());
    }




}
