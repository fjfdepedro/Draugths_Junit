package DraughtsMVC.models;

public class Piece {

    public final int x;
    public final int y;
    public final Color color;

    public Piece(int x, int y, Color color) {
        this.x     = x;
        this.y     = y;
        this.color = color;
    }

    public boolean isValidMovement(int destiny_x, int destiny_y) {
        return isLegalMovement(destiny_x, destiny_y) || isEatMovement(destiny_x, destiny_y);
    }

    public boolean isLegalMovement(int destiny_x, int destiny_y) {
        if ( destiny_x == x - 1 || destiny_x == x + 1 ) {
            if (destiny_y == y + 1 && color == Color.BLACK) {
                return true;
            } else if (destiny_y == y - 1 && color == Color.WHITE) {
                return true;
            }
        }
        return false;
    }

    public boolean isEatMovement(int destiny_x, int destiny_y) {
        if ( destiny_x == x - 2 || destiny_x == x + 2 ) {
            if (destiny_y == y + 2 && color == Color.BLACK) {
                return true;
            } else if (destiny_y == y - 2 && color == Color.WHITE) {
                return true;
            }
        }
        return false;
    }
}
