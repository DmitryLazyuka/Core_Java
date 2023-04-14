package ch04.sec04.exercise04;

public class Line extends Shape implements Cloneable {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point(this.point.getX() + to.getX() / 2, this.point.getY() + to.getY() / 2);
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
