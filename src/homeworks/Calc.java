package homeworks;

public class Calc {
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multi(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int devi(int a, int b) {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Сложение: " + add(5, 3));
        System.out.println("Вычитание: " + sub(9, 2));
        System.out.println("Умножение: " + multi(4, 6));
        System.out.println("Деление: " + devi(10, 5));
    }
}
