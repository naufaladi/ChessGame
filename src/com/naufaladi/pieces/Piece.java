package com.naufaladi.pieces;

import com.naufaladi.game.Player;

public abstract class Piece {

    public int currentX, currentY;      //current position of the piece
    public Player player;

    public Piece(int x, int y, Player player) {
        this.currentX = x;
        this.currentY = y;
        this.player = player;
    }

    public enum PieceType{
        QUEEN, KING, KNIGHT, BISHOP, ROOK, PAWN
    }







    public boolean isWhite() {

        return true;
    }




}
