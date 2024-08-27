package com.Tai_Ngonheng.Learn_Spring_Framework.game;

public class GameRunner {
    private final MarioGame gamme;
    private GamingConsole game;
    public GameRunner(MarioGame gamme){
        this.gamme = gamme;
    }
    public void run() {
        System.out.println( "Running Game"+gamme);
        gamme.up();
        gamme.down();
        gamme.right();
        gamme.left();
    }
}
