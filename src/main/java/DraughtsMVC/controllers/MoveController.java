package DraughtsMVC.controllers;

import DraughtsMVC.models.Board;
import DraughtsMVC.models.Game;
import DraughtsMVC.models.Piece;
import DraughtsMVC.models.State;

public class MoveController extends Controller{
    public MoveController(Game game, State state){
        super(game, state);
    }

    public Error move(String coordinate){
        return null;
    }

    public Piece getPiece(Board board, String coordinate){
        return board.getPiece(coordinate);
    }
}
