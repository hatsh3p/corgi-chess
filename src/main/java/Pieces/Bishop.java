package Pieces;

public class Bishop extends Piece {
    Type type;

    public Bishop(int x, int y, Color color) {
        super(x, y, color);
        type = Type.BISHOP;
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
        return Type.BISHOP;
    }

    @Override
    public String toString() {
        return "B";
    }

}
