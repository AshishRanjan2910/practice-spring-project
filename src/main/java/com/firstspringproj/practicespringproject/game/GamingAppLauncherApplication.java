package com.firstspringproj.practicespringproject.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.firstspringproj.practicespringproject.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        var gameContext = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        gameContext.getBean(GamingConsole.class).up();
        gameContext.getBean(GameRunner.class).run();
    }
}
