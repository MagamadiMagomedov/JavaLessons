package lessons.learn_class.computer;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtr(int a, int b) {
        return a - b;
    }

    public int multy(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        Calculator calculator = new Calculator();

        int sum = calculator.sum(a, b);
        int diff = calculator.subtr(a, b);
        int prod = calculator.multy(a, b);
        double quot = calculator.divide(a, b);

        System.out.println("Сумма: " + sum);
        System.out.println("Вычитание: " + diff);
        System.out.println("Произведение: " + prod);
        System.out.println("Деление: " + quot);
    }
}

