package lessons.learn_class.learn_string;

/**
 Дана непустая строка S и целое число N (> 0).
 Вывести строку, содержащую символы строки S, между которыми вставлено по N символов
 «*» (звездочка).
 */
public class Task10 {
    public static void main(String[] args) {
        String domain = "Hello";//N = 2, "H**e**l**l**o**"
        int countStars = 7;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < domain.length(); i++) {
            char symbol = domain.charAt(i);

            builder.append(symbol);//H

            String repeat = "*".repeat(countStars);//*******

            builder.append(repeat);//H*****
        }

        System.out.println(builder);
        System.out.println(builder.reverse());

    }
    public static void main1(String[] args) {
        String domain = "Hello";//N = 2, "H**e**l**l**o**"
        int countStars = 7;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < domain.length(); i++) {
            char symbol = domain.charAt(i);

            builder.append(symbol);//H

            for (int j = 0; j < countStars; j++) {
                builder.append("*");//H*****
            }
        }

        System.out.println(builder);

    }

}
