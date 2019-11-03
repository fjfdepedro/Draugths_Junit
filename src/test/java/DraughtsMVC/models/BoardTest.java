package DraughtsMVC.models;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BoardTest {

    @Test
    public void moveTo() {
        String movement = "61.52";
        Color color = Color.BLACK;
        Board board = new Board();
        board.moveTo(movement, color);
        assertNotNull(board);
    }

    @Test
    public void getPiece() {
        String movement = "61.52";
        Color color = Color.BLACK;
        Board board = new Board();
        board.moveTo(movement, color);
        Piece piece = board.getPiece(movement);
        assertNotNull(piece);
    }

    @Test
    private void existPieceColor() {
        String movement = "61.52";
        Color color = Color.BLACK;
        Board board = new Board();
        board.moveTo(movement, color);
        Piece piece = board.getPiece(movement);
        assertTrue(board.existPieceColor(color, piece));
    }

}
