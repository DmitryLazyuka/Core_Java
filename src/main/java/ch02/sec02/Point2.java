package ch02.sec02;

/**
 * Represents a point in 2D space with x and y coordinates.
 */
public class Point2 {

    /**
     * The x-coordinate of this point.
     */
    private double x;

    /**
     * The y-coordinate of this point.
     */
    private double y;

    /**
     * Constructs a new point with the given x and y coordinates.
     *
     * @param x the x-coordinate of the new point
     * @param y the y-coordinate of the new point
     */
    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x-coordinate of this point.
     *
     * @return the x-coordinate of this point
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of this point.
     *
     * @return the y-coordinate of this point
     */
    public double getY() {
        return y;
    }

    /**
     * Translates this point by the given amounts in the x and y directions.
     *
     * @param x the amount to translate in the x direction
     * @param y the amount to translate in the y direction
     */
    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    /**
     * Scales this point by the given factor in both the x and y directions.
     *
     * @param factor the scaling factor
     */
    public void scale(double factor) {
        this.x *= factor;
        this.y *= factor;
    }

    /**
     * Returns a string representation of this point in the format "Point2[x=<x>, y=<y>]".
     *
     * @return a string representation of this point
     */
    @Override
    public String toString() {
        return "Point2[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}

