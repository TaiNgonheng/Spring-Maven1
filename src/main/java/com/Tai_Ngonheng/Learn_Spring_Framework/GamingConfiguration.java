package com.Tai_Ngonheng.Learn_Spring_Framework;

import com.Tai_Ngonheng.Learn_Spring_Framework.game.GameRunner;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.GamingConsole;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.MarioGame;
import com.Tai_Ngonheng.Learn_Spring_Framework.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new PacMan();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole gamme){
        var gameRunner = new GameRunner(gamme);
        return gameRunner;
    }
}
