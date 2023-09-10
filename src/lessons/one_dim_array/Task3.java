package lessons.one_dim_array;

import java.util.Random;

/**
 * Создать массив из 20 чисел, проинициализировать его элементы случайными числами от 18 до 57.
 * Вывести на консоль элементы от 9 до 15 индекса.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[20];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(18, 57);
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i >= 9 && i <= 15) {
//                System.out.print(array[i] + "\t");
            }
        }

        for (int i = 9; i <= 15; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
