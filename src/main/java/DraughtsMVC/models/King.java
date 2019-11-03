package DraughtsMVC.models;

public class King extends Piece {

    public King(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean isValidMovement(int destiny_x, int destiny_y) {
        if ( destiny_x <=x - 1 || destiny_x >= x + 1 ) {
            if (destiny_y >= y + 1 && color == Color.BLACK) {
                return true;
            } else if (destiny_y <= y - 1 && color == Color.WHITE) {
                return true;
            }
        }
        return false;
    }
}
