package DraughtsMVC.models;

import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class PieceTest {

    @Test
    public void isValidMovement() {
        int destiny_x = 5;
        int destiny_y = 2;
        Piece piece = new Piece(6,1, Color.BLACK);
        assertTrue(piece.isValidMovement(destiny_x, destiny_y));
    }


    @Test
    public void isLegalMovement() {
        int destiny_x = 5;
        int destiny_y = 2;
        Piece piece = new Piece(6,1, Color.BLACK);
        assertTrue(piece.isLegalMovement(destiny_x, destiny_y));
    }

    @Test
    public void isEatMovement() {
        int destiny_x = 4;
        int destiny_y = 3;
        Piece piece = new Piece(6,1, Color.BLACK);
        assertTrue(piece.isEatMovement(destiny_x, destiny_y));
    }
}


