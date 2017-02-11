public class Board {
    public static final int SIZE = 3;
    private Piece[][] pieces;
    private boolean isXTurn;

    public boolean equals(Object o) {
        Board otherBoard = (Board) o;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!this.pieces[i][j].equals(otherBoard.pieces[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int code = 0;
        if (this.isXTurn) {
            code = 1;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Piece currentPiece = this.pieces[i][j];
                code *= 3;
                if (currentPiece != null) {
                    code += currentPiece.hashCode();
                }
            }
        }
        return code;
    }
}
