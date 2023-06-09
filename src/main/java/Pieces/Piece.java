package Pieces;

public abstract class Piece {
    private final Color color;
    private boolean captured;
    public int x, y;
    public Piece(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.captured = false; // All pieces start NOT captured.
    }

    public abstract boolean isValidPath(int finalX, int finalY);

    public abstract int[][] drawPath(int startX, int startY, int finalX, int finalY);

    public abstract Type getType();
}

