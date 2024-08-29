package com.Tai_Ngonheng.Learn_Spring_Framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, address Adress){ };
record address (int firstline, String city){};
record Information (int id, String firstname, String lastname, char gender, String email, String phone_Number ){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
     return "Watermelon";
    }

    @Bean
    public int age(){
        return 19;
    }

    @Bean
    public Person person(){
        return new Person("Ravi",19,Address());

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
        return new Person(name(),age(), Address());
    }



}
