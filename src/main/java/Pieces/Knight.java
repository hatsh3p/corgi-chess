package Pieces;

public class Knight extends Piece {
    Type type;

    public Knight(int x, int y, Color color) {
        super(x, y, color);
        type = Type.KNIGHT;
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
        return Type.KNIGHT;
    }

    @Override
    public String toString() {return "N";}

}
