package com.github.notoriouskyoko;

import com.github.notoriouskyoko.game.GameEngine;
import com.github.notoriouskyoko.graphic.window;

public class ludo {
   public static GameEngine game = new GameEngine();
    public static void main(String[] args){


        if (args.length != 0){
            if(Integer.parseInt(args[0]) != 1) {
                System.out.println("starting game with " + args[0] + " player(s)");
                game.runGame(Integer.parseInt(args[0]));
                new window().run();



            }else if(Integer.parseInt(args[0]) == 1){
                System.out.println("can't start a game with one player, need at least two or more");
            }
        }else{
            System.out.println("no arguments, starting game with default 4 players");
            game.runGame(4);
            new window().run();
        }

    }

}
