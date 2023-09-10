package homeworks.hw_04_07_23;

public class DataRepeat {
    public static void main(String[] args) {
        String result1 = repeat1("mice", 5);
        String result2 = repeat("hello", 3);
        String result3 = repeat("mice", 1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static String repeat(String str, int n) {
        if (n <= 0) {
            return "Error";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = 0; j < n; j++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
    public static String repeat1(String str, int n) {
        if (n <= 0) {
            return "Error";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String value = String.valueOf(ch).repeat(n);
            result.append(value);
        }

        return result.toString();
    }
}

