public class Piece {
    private String type;

    public boolean equals(Object o) {
        Piece otherPiece = (Piece) o;
        return this.type.equals(otherPiece.type);
    }

    public int hashCode() {
        if (this.type.equals("X")) {
            return 2;
        } else if (this.type.equals("O")) {
            return 1;
        } else {
            return 0;
        }
    }
}
