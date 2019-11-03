package DraughtsMVC.models;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PlayerTest {

    @Test
    public void movePiece(){
        Board board = new Board();
        String movement = "61.52";
        Color color = Color.BLACK;
        Player player = new Player(color);
        assertNotNull(player);
    }
}
