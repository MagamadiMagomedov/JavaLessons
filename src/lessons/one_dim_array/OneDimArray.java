package lessons.one_dim_array;

import java.util.Random;

public class OneDimArray {
    public static void main(String[] args) {
//        datatype[] name = new datatype[size];
        int[] array = new int[50];//0

        array[0] = 5;
        array[1] = 7;
        array[2] = 1;
        array[3] = 0;
        array[4] = 9;

//        System.out.println(array[2]);

        for (int i = 0; i < array.length; i++) {
          /*  array[i] = i + 1;
            System.out.print(array[i] + "\t");*/
        }

        /*
        * iter0: i == 0, array[0] = 0 + 1
        * iter1: i == 1, array[1] = 1 + 1
        * iter2: i == 2, array[2] = 2 + 1
        * */

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 35);
            System.out.print(array[i] + "\t");
        }
    }
}
