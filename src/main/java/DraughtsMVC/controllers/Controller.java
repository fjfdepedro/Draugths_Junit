package DraughtsMVC.controllers;

import DraughtsMVC.models.Game;
import DraughtsMVC.models.State;

public class Controller {
    protected Game game;
    private State state;

    public Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }
}
