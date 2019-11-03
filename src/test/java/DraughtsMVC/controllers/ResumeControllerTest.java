package DraughtsMVC.controllers;

import DraughtsMVC.models.Board;
import DraughtsMVC.models.Game;
import DraughtsMVC.models.State;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;



public class ResumeControllerTest {
    public ResumeControllerTest(){

    }

    @Test
    public void resumeTest() {
        Game game = new Game();
        State state = new State();
        ResumeController resumeController = new ResumeController(game, state);
        resumeController.resume(true);
        assertThat(resumeController.game.getBoard(), is(new Board()));
    }
}
