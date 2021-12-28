import java.util.Arrays;

public class Rectangle {
    private final Point[] corners;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.corners = new Point[]{topLeft, bottomRight};
    }

    public Point[] getCorners() {
        return Arrays.copyOf(corners, corners.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "corners=" + Arrays.toString(corners) +
                '}';
    }
}
