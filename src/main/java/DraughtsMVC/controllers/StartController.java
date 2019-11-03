package DraughtsMVC.controllers;

import DraughtsMVC.models.Board;
import DraughtsMVC.models.Game;
import DraughtsMVC.models.State;

public class StartController extends  Controller{

    public StartController(Game game, State state) {
        super(game, state);
    }

    public Board start() {
        return this.game.getBoard();
    }
}
