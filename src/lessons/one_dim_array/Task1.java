package lessons.one_dim_array;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[20];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 50);
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 30) {
                System.out.print(array[i] + "\t");
            }
        }

    }
}
