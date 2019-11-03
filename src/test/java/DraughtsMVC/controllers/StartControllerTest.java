package DraughtsMVC.controllers;

import DraughtsMVC.models.Board;
import DraughtsMVC.models.Game;
import DraughtsMVC.models.State;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class StartControllerTest {
    public StartControllerTest(Game game, State state) {

    }

    @Test
    public void startTest() {
        Board board = new Board();
        StartController startController = new StartController(new Game(), new State());
        assertEquals(startController.start(), board);
    }
}
