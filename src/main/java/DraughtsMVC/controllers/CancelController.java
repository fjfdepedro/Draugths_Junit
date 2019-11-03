package DraughtsMVC.controllers;

import DraughtsMVC.models.Game;
import DraughtsMVC.models.State;

public class CancelController extends Controller{
    public CancelController(final Game game, final State state){
        super(game, state);
    }

    public void cancel(final boolean b){
    }
}
