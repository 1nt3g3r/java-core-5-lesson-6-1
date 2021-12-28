public class Point {
    public static final Point ZERO = of(0, 0);
    public static final Point ONE = of(1, 1);

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Mutable
//    public void add(Point point) {
//        this.x += point.x;
//        this.y += point.y;
//    }

    //Immutable
    public Point add(Point point) {
        return new Point(this.x + point.x, this.y + point.y);
    }

    public Point sub(Point point) {
        return new Point(x - point.x, y - point.y);
    }

    public Point mul(Point point) {
        return new Point(x * point.x, y * point.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }
}
