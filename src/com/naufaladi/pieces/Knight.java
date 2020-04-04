package com.naufaladi.pieces;

import com.naufaladi.game.Team;
import com.naufaladi.game.ChessBoard;

import java.util.List;

public class Knight extends Piece {

    Knight(final int piecePosition, final Team pieceTeam) {
        super(piecePosition, pieceTeam);
    }

    @Override
    public List<Move> calculateValidMoves(ChessBoard chessBoard) {
        return null;
    }
}
