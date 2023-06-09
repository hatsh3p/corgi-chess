package Game;

public class Board {
    char[][] board;

    public Board() {
        this.board = intialize();
    }

    private char[][] intialize() {
        char[][] board = new char[8][8];
        board[0] = new char[]{'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'};
        board[1] = new char[]{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'};
        board[2] = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        board[3] = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        board[4] = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        board[5] = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        board[6] = new char[]{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'};
        board[7] = new char[]{'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'};

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
}
