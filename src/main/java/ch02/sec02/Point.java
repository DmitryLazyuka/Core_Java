package ch02.sec02;

/**
 * Represents a point in 2D space with x and y coordinates.
 */
public record Point(double x, double y) {

    /**
     * Translates this point by the given amounts in the x and y directions.
     *
     * @param x the amount to translate in the x direction
     * @param y the amount to translate in the y direction
     * @return a new point that has been translated
     */
    public Point translate(double x, double y) {
        x += this.x;
        y += this.y;
        return new Point(x, y);
    }

    /**
     * Scales this point by the given factor in both the x and y directions.
     *
     * @param factor the scaling factor
     * @return a new point that has been scaled
     */
    public Point scale(double factor) {
        double x = this.x * factor;
        double y = this.y * factor;
        return new Point(x, y);
    }
}