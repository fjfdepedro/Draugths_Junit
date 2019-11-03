package DraughtsMVC.models;

public class Square {

    private final int x;
    private final int y;
    public final Piece piece;

    public Square(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }


    public Square(Color black, Piece piece) {
        this.y = piece.y;
        this.x = piece.x;
        this.piece = piece;
    }

}
