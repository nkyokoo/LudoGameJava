package com.github.notoriouskyoko.game.Dice;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
     int rolledNumber;

    Random rnd = new Random();
    public int roll(){
        rolledNumber = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        System.out.println(rolledNumber);
        return rolledNumber;
    }
}
