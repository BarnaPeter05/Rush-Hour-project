package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {

    @Test
    void constructorStoresRowAndCol() {
        Position p = new Position(3, 5);
        assertEquals(3, p.getRow());
        assertEquals(5, p.getCol());
    }

    @Test
    void northEastMovesUpAndRight() {
        Position p = new Position(new Position(3, 3), Direction.NORTHEAST);
        assertEquals(new Position(2, 4), p);
    }

    @Test
    void allDirectionsFromCenter() {
        Position c = new Position(4, 4);
        assertEquals(new Position(3, 3), new Position(c, Direction.NORTHWEST));
        assertEquals(new Position(3, 5), new Position(c, Direction.NORTHEAST));
        assertEquals(new Position(5, 3), new Position(c, Direction.SOUTHWEST));
        assertEquals(new Position(5, 5), new Position(c, Direction.SOUTHEAST));
    }

    @Test
    void equalsAndHashCodeWork() {
        Position a = new Position(1, 2);
        Position b = new Position(1, 2);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertNotEquals(a, new Position(2, 1));
    }

    @Test
    void toStringIsReadable() {
        assertEquals("(1,2)", new Position(1, 2).toString());
    }
}