package com.Tai_Ngonheng.Learn_Spring_Framework;

import com.Tai_Ngonheng.Learn_Spring_Framework.game.GameRunner;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.MarioGame;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.PacMan;

public class App01GamingBasicJava {
    public static void main(String[] args) {
          var gamme = new PacMan();
//        var game = new SuperContraGame();
//        var game = new PacMan();
        var gameRunner = new GameRunner(gamme);
        gameRunner.run();
    }
}
