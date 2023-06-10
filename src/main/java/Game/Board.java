package Game;

import Pieces.*;

public class Board {
    Piece[][] board;
    Player white;
    Player black;

    int size = 8;


    public Board() {
        this.board = new Piece[size][size];
        createPlayers();
        placePieces(size);
    }

    private void createPlayers() {
        this.white = new Player(Color.WHITE);
        this.black = new Player(Color.BLACK);
    }


    private void placePieces(int size) {
        for (Piece piece : white.pieces) {
            board[piece.x][piece.y] = piece;
        }
        for (Piece piece : black.pieces) {
            board[piece.x][piece.y] = piece;
        }
    }

    public String toString() {
        StringBuilder builderStr = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                builderStr.append(' ');
                if (board[i][j] != null) {
                    builderStr.append(this.board[i][j].toString());
                } else {
                    builderStr.append(' ');
                }
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
