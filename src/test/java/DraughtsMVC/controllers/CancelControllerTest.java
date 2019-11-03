package DraughtsMVC.controllers;

import DraughtsMVC.models.Game;
import DraughtsMVC.models.State;
import static org.junit.Assert.assertEquals;

import DraughtsMVC.models.StateValue;
import org.junit.Test;

public class CancelControllerTest {
    public CancelControllerTest(final Game game, final State state){
    }

    @Test
    public void cancelTest(final boolean b){
        Game game = new Game();
        State state = new State();
        CancelController cancelController = new CancelController(game, state);
        cancelController.cancel(b);
        assertEquals(state.getValueState(), StateValue.FINAL);
    }
}
