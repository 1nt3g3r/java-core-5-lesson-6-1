import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTests {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String text = new String("Hello");

        String anotherText = "Hello";

        System.out.println(text.equals(anotherText));

        //74 - J
        //65 - A
        //86 - V

        byte[] message = {
             74, //J
             65, //A
             86, //V
             65  //A
        };
        System.out.println("new String(message) = " + new String(message, "UTF-8"));

        System.out.println("removeChar(\"Hello\", 'l') = " + removeChar("Hello", 'l'));

    }

    public static String removeChar(String line, char c) {
        char[] chars = line.toCharArray();

        int validCharCount = 0;
        for (char lineChar :chars){
            if (lineChar != c) {
                validCharCount++;
            }
        }

        char[] result = new char[validCharCount];
        int index = 0;
        for (char lineChar : chars) {
            if (lineChar != c) {
                result[index++] = lineChar;
            }
        }

        return new String(result);
    }
}
