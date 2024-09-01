package com.Tai_Ngonheng.Learn_Spring_Framework.game;

public class GameRunner {
    private final GamingConsole gamme;
    private GamingConsole game;
    public GameRunner(GamingConsole gamme){
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
