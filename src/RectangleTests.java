public class RectangleTests {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(
                Point.of(3, 3),
                Point.of(5, 5)
        );

        rect.getCorners()[0] = Point.of(10, 10);

        System.out.println("rect = " + rect);
    }
}
