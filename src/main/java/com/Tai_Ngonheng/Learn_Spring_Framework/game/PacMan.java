package com.Tai_Ngonheng.Learn_Spring_Framework.game;

import org.springframework.stereotype.Component;

@Component

public class PacMan implements GamingConsole {
    public void up(){
        System.out.println("It's PacMan game");
        System.out.println(" tv ler 10`");
    }
    public void down(){
        System.out.println(" tv krom 10");
    }
    public void left(){
        System.out.println(" tv jveng 10");
    }
    public void right(){
        System.out.println(" tv sdam 10");
    }



}
