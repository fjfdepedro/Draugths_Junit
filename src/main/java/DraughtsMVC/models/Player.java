package DraughtsMVC.models;

public class Player {

    private final Color color;

    public Player(Color color) {
        this.color = color;
    }

    public void movePiece(Board board, String movement){
        board.moveTo(movement, color);
    }
}
