package com.github.notoriouskyoko.game.player;

import java.util.ArrayList;
import java.util.List;

public class player implements PlayerInterface {
    private String playerName = "";
    private PlayerTeam playerTeam = null;
    private boolean isAI = false;
    private ArrayList<piece> pieces = new ArrayList<>();

    public boolean isAI() {
        return isAI;
    }

    public void setAI(boolean AI) {
        isAI = AI;
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public PlayerTeam getPlayerTeam() {
        return playerTeam;
    }

    @Override
    public ArrayList<piece> getPieces() {
        return pieces;
    }

    @Override
    public void setPieces(ArrayList<piece> pieces) {
        this.pieces = pieces;
    }


    @Override
    public void setPlayerTeam(PlayerTeam playerTeam) {
        this.playerTeam = playerTeam;
    }

    @Override
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
