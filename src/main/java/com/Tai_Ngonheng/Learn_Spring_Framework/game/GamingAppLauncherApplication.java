package com.Tai_Ngonheng.Learn_Spring_Framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com/Tai_Ngonheng/Learn_Spring_Framework/game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
    try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
        System.out.println("hello world");

    }
  }
}
