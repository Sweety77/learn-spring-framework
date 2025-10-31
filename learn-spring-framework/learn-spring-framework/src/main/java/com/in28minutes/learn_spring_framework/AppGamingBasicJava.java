package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        // var is type inference keyword introduced in Java 10 -> allows compiler to infer the type of the variable based on the value assigned.


        /*
        Here to Introduce another game we need to do a lot of changes in code So, for that reason  may take some meore type
         */

//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();

        var gameRunner = new GameRunner(superContraGame);

        gameRunner.run();
    }
}
