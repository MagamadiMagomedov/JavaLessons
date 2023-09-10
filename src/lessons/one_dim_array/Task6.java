package lessons.one_dim_array;

import java.util.Random;


public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[20];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(18, 57);
            System.out.print(array[i] + "\t");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
           sum += array[i];
        }

        System.out.println(sum);

    }
}
