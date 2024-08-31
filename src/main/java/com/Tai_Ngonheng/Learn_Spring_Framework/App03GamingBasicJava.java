package com.Tai_Ngonheng.Learn_Spring_Framework;

import com.Tai_Ngonheng.Learn_Spring_Framework.game.GameRunner;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.GamingConsole;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.MarioGame;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
//          var gamme = new PacMan();
////        var game = new SuperContraGame();
////        var game = new PacMan();
//        var gameRunner = new GameRunner(gamme);
//        gameRunner.run();

        // video 18 6:50mn
    }
}
