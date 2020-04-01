package com.naufaladi.pieces;

import com.naufaladi.game.Player;

import static com.naufaladi.pieces.Piece.PieceType.ROOK;


public class Rook extends Piece {

    PieceType pieceType;


    public Rook (int x, int y, Player player){
        super(x, y, player);
        pieceType = ROOK;
    }

    public boolean canMove(int targetX, int targetY){



        return true;
    }


}
