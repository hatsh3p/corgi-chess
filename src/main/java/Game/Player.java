package Game;

import Pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class Player {
    boolean isStartingPlayer;

    List<Piece> pieces;

    public Player(boolean isStartingPlayer) {
        this.isStartingPlayer = isStartingPlayer;
        List<Piece> pieces = new ArrayList<>();
    }

}
