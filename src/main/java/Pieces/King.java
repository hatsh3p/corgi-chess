package Pieces;

public class King extends Piece {
    Type type;

    public King(int x, int y, Color color) {
        super(x, y, color);
        type = Type.KING;
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
        return Type.KING;
    }

    @Override
    public String toString() {
        return "K";
    }
}
