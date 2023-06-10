package Pieces;

public class Rook extends Piece {
    Type type;

    public Rook(int x, int y, Color color) {
        super(x, y, color);
        type = Type.ROOK;
    }
    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        return new int[0][];
    }

    @Override
    public Type getType() {
        return Type.ROOK;
    }

    @Override
    public String toString() {
        return "R";
    }
}
