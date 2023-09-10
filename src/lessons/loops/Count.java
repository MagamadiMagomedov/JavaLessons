package lessons.loops;

public class Count {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 40; ++i) {
            if (i % 2 == 0) {
                ++count;
            }
        }

        System.out.println("Count = " + count);
    }
}
