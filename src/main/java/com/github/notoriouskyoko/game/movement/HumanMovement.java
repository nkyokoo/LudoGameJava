package com.github.notoriouskyoko.game.movement;

public class HumanMovement implements movementInterface  {

    @Override
    public void move(int numberOfFields) {

    }

    public static HumanMovement humanMovement(){
        return new HumanMovement();
    }
}
