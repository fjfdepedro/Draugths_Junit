package DraughtsMVC.controllers;

import DraughtsMVC.models.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MoveControllerTest {

    public MoveControllerTest(){
    }


    @Test
    public void getPieceTest(){
        Board board = new Board();
        String coordinate = "21";
        Game game = new Game();
        State state = new State();
        MoveController moveController = new MoveController(game, state);
        Piece piece = new Piece(2, 1, Color.BLACK);
        assertEquals(moveController.getPiece(board, coordinate), piece);
    }
}
