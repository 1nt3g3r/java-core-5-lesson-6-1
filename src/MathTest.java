import java.math.BigDecimal;

public class MathTest {
    public static void main(String[] args) {
        BigDecimal one = new BigDecimal("0.1");
        BigDecimal two = new BigDecimal("0.3");

        BigDecimal result = one;

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {
            result = BigDecimal.ZERO.add(BigDecimal.ONE);
//            result = result.multiply(two);
        }

        long end = System.currentTimeMillis();

        long duration = end - start;
        System.out.println("duration = " + duration);


//        System.out.println("result = " + result);

    }
}
