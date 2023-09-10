package homeworks;

public class RepeatWords {

    public static void main(String[] args) {
        String domain = "Hello";
        int countStars = 2;
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < domain.length(); ++i) {
            char symbol = domain.charAt(i);
            builder.append(symbol);
            String repeat = "*".repeat(countStars);
            builder.append(repeat);
        }

        System.out.println(builder);
        System.out.println(builder.reverse());
    }
}

