package com.firstspringproj.practicespringproject.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
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
