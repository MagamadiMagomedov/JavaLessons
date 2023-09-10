package lessons.learn_class.learn_string;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "Hello, my. young, friend";

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char symbol = sentence.charAt(i);

            if (symbol == '.' || symbol == ',') {
                count++;
            }
        }

        System.out.println(count);
    }
}
