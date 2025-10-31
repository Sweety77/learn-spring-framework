package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        // var is type inference keyword introduced in Java 10 -> allows compiler to infer the type of the variable based on the value assigned.
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);

        gameRunner.run();
    }
}
