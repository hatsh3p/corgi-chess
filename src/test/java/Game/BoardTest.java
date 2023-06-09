package Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void initialToString() {
        Board board = new Board();
        String expectedBoard =
                " R  N  B  Q  K  B  N  R \n" +
                " P  P  P  P  P  P  P  P \n" +
                "                        \n" +
                "                        \n" +
                "                        \n" +
                "                        \n" +
                " P  P  P  P  P  P  P  P \n" +
                " R  N  B  Q  K  B  N  R \n" ;
        Assertions.assertEquals(expectedBoard, board.toString());
    }
}