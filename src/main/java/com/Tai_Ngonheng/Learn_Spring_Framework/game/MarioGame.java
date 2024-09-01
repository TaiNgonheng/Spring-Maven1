package com.Tai_Ngonheng.Learn_Spring_Framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary


public class MarioGame implements GamingConsole {


    public void up(){
        System.out.println(" It's Mario Game.");
        System.out.println("jump");
    }
    public void down(){
        System.out.println("crawl");
    }
    public void left(){
        System.out.println("turn left");
    }
    public void right(){
        System.out.println("turn right");
    }



}
