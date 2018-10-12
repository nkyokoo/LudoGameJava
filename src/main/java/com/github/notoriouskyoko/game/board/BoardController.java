package com.github.notoriouskyoko.game.board;

import com.github.notoriouskyoko.game.player.piece;
import com.github.notoriouskyoko.game.player.player;
import com.github.notoriouskyoko.ludo;
import com.sun.javafx.geom.Vec2d;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

import static javafx.scene.input.KeyCode.T;

class BoardController {
    public class field{
        int Yposition;
        int Xposition;
        String id;
        String type;
        String color;

         field(int _Yposition, int _Xposition, String _id, String _type, String _color){
             Yposition = _Yposition;
             Xposition = _Xposition;
             id = _id;
             type = _type;
             color = _color;
        }

    }

    private String getPiece(int piece,int player){
        player pl = ludo.game.getPlayers().get(player);
        piece p = pl.getPieces().get(piece);
        return p.getContent();
    }


    public void createBoard() {




    }
}
