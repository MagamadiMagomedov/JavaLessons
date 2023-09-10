package lessons.learn_class.learn_string;

public class LearnStringBuilder {
    public static void main(String[] args) {
        String str = "World";

        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i < 10; i++) {
//            str += i;
//            str = str + i;

            builder.append(i);
        }

//        System.out.println(str);

        System.out.println(builder);
    }
}
/**
 * iter0: i == 0; str = World0, World
 * iter1: i == 1; str = World01, World0
 * iter2: i == 2; str = World012, World01
 */