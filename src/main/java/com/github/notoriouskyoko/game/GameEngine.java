package com.github.notoriouskyoko.game;

import com.github.notoriouskyoko.game.Dice.Dice;
import com.github.notoriouskyoko.game.Dice.DiceStates;
import com.github.notoriouskyoko.game.board.BoardController;
import com.github.notoriouskyoko.game.player.PlayerTeam;
import com.github.notoriouskyoko.game.player.piece;
import com.github.notoriouskyoko.game.player.player;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.Callable;

public class GameEngine implements GEInterface{

    ArrayList<player> players = new ArrayList<>();
    volatile boolean  isHuman = false;
    List<PlayerTeam> turns = Arrays.asList(PlayerTeam.values());
    PlayerTeam currentTurn = PlayerTeam.RED;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public void runGame(int numberOfPlayers){

       for(int i = 0; i < numberOfPlayers; i++){
           player pl = new player();
           pl.setPlayerName("player" + String.valueOf(i));
           pl.setPlayerTeam(PlayerTeam.values()[i]);
           for (int j = 0; j < 4; j++) {
               piece p = new piece();
               p.set_id("piece" + j);
               ArrayList tempArray = pl.getPieces();
               tempArray.add(p);
               pl.setPieces(tempArray);

           }
           players.add(pl);
       }
       String playernames = "";

       for (player p : players){
           playernames += p.getPlayerName() + ", ";
       }

        System.out.println( "players: "  + playernames.substring(0, playernames.length() - 2));
        isHuman = false;
        Thread thread = new Thread(() -> game());
        thread.setName("game");
        thread.start();

    }
    private void game(){
        Dice dice = new Dice();
        System.out.println("game started");
        DiceStates diceState = DiceStates.ROLL;
        BoardController board = new BoardController();




    }
    public void nextTurn(){

        switch (currentTurn){
            case RED:
                  currentTurn = PlayerTeam.BLUE;
                break;
            case BLUE:
                currentTurn = PlayerTeam.GREEN;
                break;
            case GREEN:
                currentTurn = PlayerTeam.YELLOW;
                break;
            case YELLOW:
                 currentTurn = PlayerTeam.RED;
                break;
        }

        System.out.println(currentTurn);


    }
    public static GameEngine getInstance(){
        return new GameEngine();
    }

    @Override
    public List<player> getPlayers() {
        return players;
    }

    @Override
    public PlayerTeam getTurn() {
        return currentTurn;
    }
}
