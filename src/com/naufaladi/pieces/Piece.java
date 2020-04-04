package com.naufaladi.pieces;

import com.naufaladi.game.Team;
import com.naufaladi.game.ChessBoard;


import java.util.List;

public abstract class Piece {       // abstract because Piece is generic and not instantiable

    protected final int piecePosition;
    protected final Team pieceTeam;

    Piece(final int piecePosition, final Team pieceTeam){
        this.piecePosition = piecePosition;
        this.pieceTeam = pieceTeam;
    }

    public abstract List<Move> calculateValidMoves(final ChessBoard chessBoard);


    public enum PieceType {
        BISHOP, KING, KNIGHT, PAWN, QUEEN, ROOK
    }
}
