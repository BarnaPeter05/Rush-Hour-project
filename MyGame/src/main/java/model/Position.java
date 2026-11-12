package model;

import java.util.Objects;

/** Egy mező helye a pályán (sor, oszlop). Immutable. */
public class Position {

    private final int row;
    private final int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /** Az adott pozícióból egy lépés a megadott irányba. */
    public Position(Position hpos, Direction dir) {
        this(hpos.row + dir.getRowStep(), hpos.col + dir.getColStep());
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position other = (Position) o;
        return row == other.row && col == other.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}