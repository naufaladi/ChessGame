package com.naufaladi.game;

import com.naufaladi.pieces.Piece;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public abstract class Tile {

    protected final int tileCoordinate;    // give the coordinate of each tile

    private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = createAllPossibleEmptyTiles();

    private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
        final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();

        for(int i = 0; i <64; i++){
            emptyTileMap.put(i, new EmptyTile(i));
        }
        return Collections.unmodifiableMap(emptyTileMap);
    }

    public static Tile createTile(final int tileCoordinate, final Piece piece){
        return piece != null
                ? new OccupiedTile(tileCoordinate, piece)
                : EMPTY_TILES_CACHE.get(tileCoordinate);
    }

    private Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();
    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile {         // checks whether the tile is empty

        EmptyTile(final int tileCoordinate) {         // get the tile coordinate from this.tileCoordinate
            super(tileCoordinate);
        }

        @Override
        public boolean isTileOccupied() {       // return false since the tile is empty
            return false;
        }

        @Override
        public Piece getPiece() {       // return nothing since the tile is empty
            return null;
        }
    }

    public static final class OccupiedTile extends Tile {       // checks whether the tile is occupied by a piece

       private final Piece pieceOnTile;         // instantiated since there will be a piece on occupied tile

        OccupiedTile(int tileCoordinate, Piece pieceOnTile) {
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public boolean isTileOccupied() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
    }

}
