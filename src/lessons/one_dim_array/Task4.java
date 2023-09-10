package lessons.one_dim_array;

import java.util.Random;

/**
 * Write a program that print every second element in an array
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(18, 57);
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + "\t");
            }
        }

        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + "\t");
        }
    }
}
