package mx.unam.fciencias.myp.utils;

import java.awt.geom.Point2D;

/**
 * Game vectors
 *
 * @author Luis Daniel Aragon Bermudez 416041271
 */
public abstract class GameVector extends Point2D.Double {
    /**
     * Constructs and initializes a Point2D with the specified coordinates.
     *
     * @param x the X coordinate of the newly constructed GameVector
     * @param y the Y coordinate of the newly constructed GameVector
     */
    GameVector(Number x, Number y) {
        super(x.doubleValue(), y.doubleValue());
    }

    /**
     * Normalizes this vector.
     */
    public void normalize() {
        double magnitude = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        this.x = this.x / magnitude;
        this.y = this.y / magnitude;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }


}

