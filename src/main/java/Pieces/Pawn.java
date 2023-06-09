package Pieces;

import Game.Player;

// Pawn inherits from Piece.
public class Pawn extends Piece {
    Type type;

    public Pawn(int x, int y, Player player) {
        super(x, y, player); // Calls the constructor of the generic piece.
        type = Type.PAWN;
    }

    /* A pawn can move in the X or Y direction by 1.
     *  ex. if pawn is at (3,3), it can move:
     *  (1) X direction +1 -> (4,3)
     *  (2) X direction -1 -> (2,3)
     *  (3) Y direction +1 -> (3,4)
     *  (4) Y direction -1 -> (3,2)
     *
     * // TODO: Handle edge of board later.
     *  A pawn cannot move beyond the edges of the board.
     *  ex. if a pawn is at (0,0), it cannot move to:
     *  (1) X direction -1 -> (-1,0)
     *  (2) Y direction -1 -> (0,-1)
     *  finalX and finalY must be positive ints.
     */
    @Override
    public boolean isValidPath(int finalX, int finalY) {
        int x_diff = Math.abs(finalX - this.x);
        int y_diff = Math.abs(finalY - this.y);

        if ((x_diff == 0 && y_diff == 1) || (x_diff == 1 && y_diff == 0)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int[][] drawPath(int startX, int startY, int finalX, int finalY) {
        int x_dir = 1, y_dir = 1; // Determining direction.

        return new int[0][];
    }

    @Override
    public Type getType() {
        return Type.PAWN;
    }
}
