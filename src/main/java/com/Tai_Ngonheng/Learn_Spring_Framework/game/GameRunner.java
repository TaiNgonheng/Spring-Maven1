package com.Tai_Ngonheng.Learn_Spring_Framework.game;

public class GameRunner {
    SuperContraGame game;
    public GameRunner(SuperContraGame game){
        this.game = game;
    }

    public void run() {

        System.out.println( "Running Game"+game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
