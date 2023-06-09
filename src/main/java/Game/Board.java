package Game;

import Pieces.Color;
import Pieces.Pawn;
import Pieces.Piece;
import Pieces.Rook;

public class Board {
    Piece[][] board;
    int size = 8;


    public Board() {
        this.board = intialize(size);
    }

    private Piece[][] intialize(int size) {

//        Piece[][] board = new Piece[size][size];
//        board[0][0] = new Rook(0, 0, Color.WHITE);
//        board[0][1] = new Pawn(0, 1, Color.WHITE);
//        board[0][2] = new Pawn(0, 2, Color.WHITE);
//        board[0][3] = new Pawn(0, 1, Color.WHITE);
//        board[0][4] = new Pawn(0, 0, Color.WHITE);
//        board[0][5] = new Pawn(0, 1, Color.WHITE);
//        board[0][6] = new Pawn(0, 0, Color.WHITE);
//        board[0][7] = new Pawn(0, 1, Color.WHITE);

        return board;
    }

    public String toString() {
        StringBuilder builderStr = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                builderStr.append(' ');
                builderStr.append(board[i][j]);
                builderStr.append(' ');
            }
            builderStr.append('\n');
        }
        return builderStr.toString();
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);
    }
}
