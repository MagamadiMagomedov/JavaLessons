package lessons.learn_class.learn_string;

/**
 write a program that can check if the given website is valid website or not
 starts with: www.
 ends with: .com, .edu, .gov
 */
public class Task7 {
    public static void main(String[] args) {
        String domain = "www.google.com";

        boolean isStart = domain.startsWith("www");
        boolean isEnd = domain.endsWith(".com");

        System.out.println(isStart);
        System.out.println(isEnd);

    }

}
