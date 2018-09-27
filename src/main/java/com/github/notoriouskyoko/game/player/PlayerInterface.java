package com.github.notoriouskyoko.game.player;

import java.util.ArrayList;

public interface PlayerInterface {
     /**
      * Returns the player's name
      * @return  player name as String
      */
     String getPlayerName();

    /**
     *  Returns the player's team
     * @return PlayerTeam
     */
    PlayerTeam getPlayerTeam();

    /**
     *  Returns the player's pieces
     * @return pieces as ArrayList
     */
    ArrayList<piece> getPieces();

    /**
     *  Sets the player's pieces as arrayList
     *  <p>
     *  Can be used when you call a temporary ArrayList then replace player's with the temp
     *  by using example: player.setPieces(tempList);
     *  </p>
     *
     * @param pieces Arraylist
     *
     *
     */
    void setPieces(ArrayList<piece> pieces);

    /**
     *  Sets the player's team
     *
     * @param playerTeam  playerTeam
     *
     */
    void setPlayerTeam(PlayerTeam playerTeam);

    /**
     *  Sets the player's name
     *
     * @param playerName String
     *
     *
     */
    void setPlayerName(String playerName);

     boolean isAI();

     void setAI(boolean AI);





}
