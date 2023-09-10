package homeworks.hw_21_07_23;

public class CountDotsAndComm {
    public static void main(String[] args) {
        String inputString = "Строка,в которой. содержащатся, .точки и запятые.";

        int dotsCount = 0;
        int commCount = 0;

        for (int ch : inputString.toCharArray()) {
            if (ch == '.') {
                dotsCount++;
            } else if (ch == ',') {
                commCount++;
            }
        }

        System.out.println("Количество точек: " + dotsCount);
        System.out.println("Количество запятых: " + commCount);
    }


}
