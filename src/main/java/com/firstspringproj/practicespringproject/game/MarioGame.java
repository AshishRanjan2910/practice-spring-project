package com.firstspringproj.practicespringproject.game;

public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("jump");
    }
    public void down() {
        System.out.println("go into a hole...");
    }
    public void left() {
        System.out.println("back");
    }
    public void right() {
        System.out.println("accelerate");
    }

}
