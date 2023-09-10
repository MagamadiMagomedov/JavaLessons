package lessons.learn_class;

public class Sum {
    public int sumNumbers(int a, int b) {
        int sum = 0;
        if (a > -1000 && b < 1000) {
            sum = a + b;
        }
        return sum;
    }
}

class TestSum {
    public static void main(String[] args) {

        Sum link = new Sum();

        int result = link.sumNumbers(-5000, 3);

        System.out.println(result);
    }
}