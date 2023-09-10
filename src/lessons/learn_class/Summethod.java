package lessons.learn_class;

import java.util.Random;

public class Summethod {
    public static void main(String[] args) {
       Summethod sm = new Summethod();

       int sumAdd = sm.add(11);//20
       int sumSub = sm.subtraction(3);

        System.out.println(sumAdd);
        System.out.println(sumSub);
    }

    public int add(int input) {
        Random random = new Random();
        int value = random.nextInt(0, 100);
        return value + input;
    }

    public int subtraction(int input) {
        Random random = new Random();
        int value = random.nextInt(0, 100);
        return value - input;
    }
}
