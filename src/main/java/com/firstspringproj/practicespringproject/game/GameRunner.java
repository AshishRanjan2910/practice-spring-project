package com.firstspringproj.practicespringproject.game;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("run... " + game);
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
