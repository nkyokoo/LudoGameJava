package com.github.notoriouskyoko.game;

import com.github.notoriouskyoko.game.player.PlayerTeam;
import com.github.notoriouskyoko.game.player.player;

import java.util.List;

public interface GEInterface {

    List<player> getPlayers();
    PlayerTeam  getTurn();



}
