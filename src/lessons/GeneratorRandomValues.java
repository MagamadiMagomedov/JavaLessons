package lessons;

import java.util.Random;

public class GeneratorRandomValues {
    public static void main(String[] args) {
        Random random = new Random();

//        int value = random.nextInt(50);//0-49
        int value = random.nextInt(20, 50);//20-49

//        System.out.println(value);

        for (int i = 0; i < 10; i++) {
            int result = random.nextInt(20, 50);

            System.out.print(result + "\t");
        }
    }
}
