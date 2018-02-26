package mx.unam.fciencias.myp.utils;

/**
 * A Direction vector is normalized and immutable.
 * Currently there are only four possible directions the player can move in.
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public class Direction extends GameVector {
    /**
     * Normal vector that corresponds to the north direction.
     */
    public static final Direction NORTH = new Direction(0, 1);
    /**
     * Normal vector that corresponds to the east direction.
     */
    public static final Direction EAST = new Direction(1, 0);
    /**
     * Normal vector that corresponds to the south direction.
     */
    public static final Direction SOUTH = new Direction(0, -1);
    /**
     * Normal vector that corresponds to the west direction.
     */
    public static final Direction WEST = new Direction(-1, 0);

    /**
     * Creates a normalized vector from two coordinates.
     *
     * @param x the X coordinate of the vector this director vector is created from.
     * @param y the X coordinate of the vector this director vector is created from.
     */
    private Direction(Number x, Number y) {
        super(x, y);
        normalize();
    }


    /**
     * Immutable directions can't allow this.
     *
     * @param x parameter
     * @param y parameter
     * @throws UnsupportedOperationException always
     */
    @Deprecated
    @Override
    public void setLocation(double x, double y) {
        throw new UnsupportedOperationException("Directions are immutable.");
    }
}
