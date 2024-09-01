package com.Tai_Ngonheng.Learn_Spring_Framework;

import com.Tai_Ngonheng.Learn_Spring_Framework.game.GameRunner;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.GamingConsole;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();

    }
  }
}
