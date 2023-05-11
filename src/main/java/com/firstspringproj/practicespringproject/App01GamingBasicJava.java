package com.firstspringproj.practicespringproject;

import com.firstspringproj.practicespringproject.game.GameRunner;
import com.firstspringproj.practicespringproject.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
