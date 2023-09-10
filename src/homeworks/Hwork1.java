package homeworks;

public class Hwork1 {
    public static void main(String[] args) {
        cifraX();
        CompareApp();
        SumCycle();
        SumZPrint1();
        int experience = 3;
        if (experience < 2) {
            System.out.println("Коофициент работы = " + 11);
        } else if (experience >= 2 & experience < 5) {
            System.out.println("Коофициент работы = " + 12);
        } else {
            System.out.println("Коофициент работы = " + 13);
        }
    }

    public static void cifraX() {
        int x = 7;
        if (x < 0) {
            System.out.println("Число меньше нуля");
        } else if (x > 0) {
            System.out.println("Число больше нуля");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void CompareApp() {
        int a = 12;
        int b = 3;
        if (a < 10 && b < 5) {
            System.out.println("Bingo !!! Вы выиграли миллион !");
        }
    }

    public static void SumCycle() {
        int sum = 0;
        for (int i = 1; i < 50; i++) {
            sum = sum + i;
            sum += i;
        }
        System.out.println(sum);
    }

    public static void SumZPrint1() {
        for (int i = 0; i < 100; i++) {
            if (i > 30 || i < 50) {
                System.out.println(i + "\t");
            }
        }
    }
}


