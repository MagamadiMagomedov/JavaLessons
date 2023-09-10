package lessons.learn_class;

public class Task1 {
    public int sum(int a, int b) {

        int result = 0;

        if (a > -1000 && b < 1000) {
            result = a + b;
        }

        return result;
    }
}

class TestTask1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        int value = task1.sum(50, 22);
        System.out.println(value);
    }
}
