package DraughtsMVC.controllers;

import DraughtsMVC.models.Game;
import DraughtsMVC.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void resume(boolean b) {
        this.game.getBoard();
    }
}
