package lessons.learn_class.learn_string;

public class LearnString {
    public static void main(String[] args) {
        char symbol = 'f';//Hello

        final char[] word = {'H', 'e', 'l', 'l', 'o'};
        final char[] word1 = {'e', 'l', 'l', 'o'};

//        System.out.println(word.length);

//        word = new char[]{'O'};

//        word[0] = 'K';

//        System.out.println(word[0]);

        String str1 = "Hello";//object-literal
        String str2 = new String("Hello");//object

        char firstSymbol = str1.charAt(0);

//        System.out.println(firstSymbol);

        String world = str1.concat("World");

//        System.out.println(world);
//        System.out.println(str1);

        String sentence = "Hello my young friend";

        String[] words = sentence.split(" ");

        for (String a: words) {
//            System.out.println(a.length());
//            System.out.println(a);
        }

        String str4 = "World";

        String substring = str4.substring(0, 4);

//        System.out.println(substring);


    }
}
