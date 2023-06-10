package Game;

import Pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Player {
    Color color;

    List<Piece> pieces;

    public Player(Color color) {
        this.color = color;
        this.pieces = createPieces(color);
    }

    private List<Piece> createPieces(Color color) {
        int x1;
        int x2;
        if (color == Color.WHITE) {
            x1 = 0;
            x2 = 1;
        } else {
            x1 = 7;
            x2 = 6;
        }

        Rook rook1 = new Rook(x1, 0, color);
        Knight knight1 = new Knight(x1, 1, color);
        Bishop bishop1 = new Bishop(x1, 2, color);
        Queen queen = new Queen(x1, 3, color);
        King king = new King(x1, 4, color);
        Bishop bishop2 = new Bishop(x1, 5, color);
        Knight knight2 = new Knight(x1, 6, color);
        Rook rook2 = new Rook(x1, 7, color);

        Pawn pawn1 = new Pawn(x2, 0, color);
        Pawn pawn2 = new Pawn(x2, 1, color);
        Pawn pawn3 = new Pawn(x2, 2, color);
        Pawn pawn4 = new Pawn(x2, 3, color);
        Pawn pawn5 = new Pawn(x2, 4, color);
        Pawn pawn6 = new Pawn(x2, 5, color);
        Pawn pawn7 = new Pawn(x2, 6, color);
        Pawn pawn8 = new Pawn(x2, 7, color);

        return List.of(rook1, rook2, knight1, knight2, bishop1, bishop2, queen, king,
                pawn1, pawn2, pawn3, pawn4, pawn5, pawn6, pawn7, pawn8);
    }
}
