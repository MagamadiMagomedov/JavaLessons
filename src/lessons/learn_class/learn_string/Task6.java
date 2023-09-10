package lessons.learn_class.learn_string;

/**
 Input:
 xcodex
 Output:
 acodex
 */
public class Task6 {
    public static void main(String[] args) {
        String str = "xcodex";

        String replaceFirstSymbol = str.replaceFirst("x", "a");
        String replaceAll = str.replaceAll("x", "a");

        System.out.println(replaceFirstSymbol);
        System.out.println(replaceAll);

    }

}
