package com.Tai_Ngonheng.Learn_Spring_Framework;

import com.Tai_Ngonheng.Learn_Spring_Framework.game.GameRunner;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.MarioGame;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.PacMan;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
          var gamme = new MarioGame();
//        var game = new SuperContraGame();
//        var game = new PacMan();
        var gameRunner = new GameRunner(gamme);
        gameRunner.run();
    }
}
