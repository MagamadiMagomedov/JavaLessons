package lessons.loops;

public class Sum {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 40; ++i) {
//            sum += i;
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }

}

/**
 * iter 0: sum = 0 + 0 = 0;
 * iter 1: sum = 0 + 1 = 1;
 * iter 2: sum = 1 + 2 = 3;
 */
