package DraughtsMVC.models;

public class Board {

    Square[][] boardArray = new Square[8][8];
    public Board () {
        this.boardArray = boardArray;

        for (int y = 0; y < 9; y++) {
            // blacks
            if (y < 4) {
                Color black = Color.BLACK;
                for (int x = 0; x < 9;  x++) {
                    if ( x % 2 == 0 ) {
                        if ( y % 2 != 0 ) {
                            boardArray[x][y] = new Square(black, new Piece(x,y,black));
                        }
                    }
                    else {
                        if ( y % 2 == 0 ) {
                            boardArray[x][y] = new Square(black, new Piece(x,y,black));
                        }
                    }
                }
            }
            else if (y > 5){
                Color white = Color.WHITE;
                for (int x = 0; x < 9;  x++) {
                    if ( x % 2 == 0 ) {
                        if ( y % 2 != 0 ) {
                            boardArray[x][y] = new Square(white, new Piece(x,y,white));
                        }
                    }
                    else {
                        if ( y % 2 == 0 ) {
                            boardArray[x][y] = new Square(white, new Piece(x,y,white));
                        }
                    }
                }
            }
        }
    }

    public void moveTo(String movement, Color color) {
        int origin_y  = Integer.parseInt(movement.substring(0,1));
        int origin_x  = Integer.parseInt(movement.substring(1,2));
        int destiny_y = Integer.parseInt(movement.substring(3,4));
        int destiny_x = Integer.parseInt(movement.substring(4,5));
        Piece piece = new Piece(origin_x,origin_y, color);
        if (isValidMovement(piece, destiny_x, destiny_y) && existPieceColor(color, piece)) {
            boardArray[destiny_x][destiny_y] = new Square(color, new Piece(destiny_x,destiny_y, color));
            boardArray[origin_x][origin_y] = null;
        } else if (isEatMovement(piece, destiny_x, destiny_y) && existPieceColor(color, piece)) {
            boardArray[destiny_x][destiny_y] = new Square(color, new Piece(destiny_x,destiny_y, color));
            boardArray[origin_x][origin_y] = null;
            removeEatPiece(piece, destiny_x, destiny_y);
        }
    }

    public Piece getPiece(String movement) {
        int origin_y  = Integer.parseInt(movement.substring(0,1));
        int origin_x  = Integer.parseInt(movement.substring(1,2));
        return boardArray[origin_x][origin_y].piece;
    }

    protected boolean existPieceColor(Color color, Piece piece) {
        boolean exist = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (boardArray[i][j]!=null && boardArray[i][j].equals(new Square(color, piece)))
                    exist = true;
            }
        }
        return exist;
    }

    private boolean isValidMovement(Piece piece, int destiny_x, int destiny_y) {
        return piece.isValidMovement(destiny_x, destiny_y);
    }

    private boolean isEatMovement(Piece piece, int destiny_x, int destiny_y) {
        return piece.isEatMovement(destiny_x, destiny_y);
    }

    private boolean removeEatPiece(Piece piece, int destiny_x, int destiny_y) {
        if (piece.color == Color.BLACK) {

            boardArray[destiny_x+1][destiny_y] = null;
        }

        return piece.isEatMovement(destiny_x, destiny_y);
    }
}
