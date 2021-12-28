public class PointTests {
    public static void main(String[] args) {
        Point p1 = new Point(2, 2);

        p1 = Point.of(10, 20);

        Point p2 = new Point(5, 5);

        Point result = p1.add(p2).add(p2).sub(p1);

        System.out.println("p1 = " + p1);
        System.out.println("result = " + result);

        Point chainingResult =
                Point.of(5, 5)
                .add(Point.of(2, 2))
                .sub(Point.of(3, 3));

        System.out.println("chainingResult = " + chainingResult);

        Point two = Point.ONE.add(Point.ONE);
        System.out.println("two = " + two);
    }
}
