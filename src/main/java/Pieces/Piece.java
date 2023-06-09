package Pieces;

import Game.Player;

public abstract class Piece {
    private final Player player;
    public int x, y;
    public Piece(int x, int y, Player player) {
        this.x = x;
        this.y = y;
        this.player = player;
    }

    public abstract boolean isValidPath(int finalX, int finalY);

    public abstract int[][] drawPath(int startX, int startY, int finalX, int finalY);

    public abstract Type getType();
}

