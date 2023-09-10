package homeworks;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Number counter for1 ");


        for (int i = 20; i < 40; i++) {
            System.out.println("Number for1 = " + i);
        }

        System.out.println("Number counter while1 ");

        int a = 20;

        while (a < 40) {
            System.out.println("Number while1 = " + a);
            ++a;
        }

        System.out.println("Step counter for 2");


        for (int i = -10; i < 10; i++) {
            System.out.println("Number for2 = " + i);
        }

        System.out.println("Number counter while 2 ");

        int b = -10;

        while (b < 10) {
            System.out.println("Number while2 = " + b);
            ++b;
        }


    }
}