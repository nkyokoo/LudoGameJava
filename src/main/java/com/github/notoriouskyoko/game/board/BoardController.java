package com.github.notoriouskyoko.game.board;

import com.github.notoriouskyoko.game.player.piece;
import com.github.notoriouskyoko.game.player.player;
import com.github.notoriouskyoko.ludo;

public class BoardController {



    private String getPiece(int piece,int player){
        player pl = ludo.game.getPlayers().get(player);
        piece p = pl.getPieces().get(piece);
        return p.getContent();
    }


    public void createBoard() {


       String board =
               "+-------------------+------------+-----------------------+\n" +
               "|                   |            |                       |\n" +
               "|                   |   +----+   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|      "+ getPiece(0,0) + getPiece(1,0) +"           |   |    |   |         "+ getPiece(0,1) + getPiece(1,1)+"            |\n" +
               "|      "+ getPiece(2,0) + getPiece(3,0) +"           |   |    |   |         "+  getPiece(2,1) + getPiece(3,1) +"            |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "+--------------------   |    |   ------------------------+\n" +
               "|                       |    |                           |\n" +
               "|                       |    |                           |\n" +
               "|   +--------------------    -----------------------+    |\n" +
               "|   |                                               |    |\n" +
               "|   |                                               |    |\n" +
               "|   +--------------------    -----------------------+    |\n" +
               "|                       |    |                           |\n" +
               "+-------------------+   |    |   +-----------------------+\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|      " + getPiece(0,2) + getPiece(1,2) + "           |   |    |   |       "+ getPiece(0,3) + getPiece(1,3) +"              |\n" +
               "|      "+ getPiece(2,2) + getPiece(3,2) +"           |   |    |   |       "+  getPiece(2,3) + getPiece(3,3) +"              |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   |    |   |                       |\n" +
               "|                   |   +----+   |                       |\n" +
               "|                   |            |                       |\n" +
               "+-------------------+------------+-----------------------+\n";

        char[] boardChar = board.toCharArray();

        for (int i = 0; i < boardChar.length; i++) {
            System.out.print(boardChar[i]);
        }


    }
}
