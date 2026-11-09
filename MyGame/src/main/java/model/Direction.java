package model;

/**
 * Átlós lépésirányok. A koordináták mátrixszerűek:
 * a (0,0) bal felül van, a sor lefelé, az oszlop jobbra nő.
 */
public enum Direction {
    NORTHWEST(-1, -1),
    NORTHEAST(-1, +1),
    SOUTHWEST(+1, -1),
    SOUTHEAST(+1, +1);

    private final int rowStep;
    private final int colStep;

    Direction(int rowStep, int colStep) {
        this.rowStep = rowStep;
        this.colStep = colStep;
    }

    public int getRowStep() {
        return rowStep;
    }

    public int getColStep() {
        return colStep;
    }
}
