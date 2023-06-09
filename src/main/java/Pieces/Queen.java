package Pieces;

public class Queen extends Piece {
    Type type;

    public Queen(int x, int y, Color color) {
        super(x, y, color);
        type = Type.QUEEN;
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
        return Type.QUEEN;
    }

    @Override
    public String toString() {
        return "Q";
    }


}
