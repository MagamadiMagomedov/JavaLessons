package lessons.conditional_operator;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a < 10 && b > 15) {//logical AND
            System.out.println("a < 10 && b > 15");
        }

        if (a < 10 || b > 15) {//logical OR
            System.out.println("a < 10 || b > 15");
        }

        if (a < 10) {
            System.out.println("a < 10");
        } else {
            System.out.println("a >= 10");
        }

        if (a < 10) {
            System.out.println("a < 10");
        } else if(a > 10) {
            System.out.println("a > 10");
        } else {
            System.out.println("a == 10");
        }
    }
}

/**
 * true && false = false
 * true && true = true
 * false && false = false
 *
 * false || false = false
 * true || false = true
 * true || true = true
 */
