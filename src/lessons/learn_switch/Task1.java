package lessons.learn_switch;

public class Task1 {
    public static void main(String[] args) {
        int c = 40;//20, 30, 40, default = 15

        switch (c) {
            case 40:
                System.out.println("с == 40");
               break;

            case 30:
                System.out.println("с == 30");
                break;

            case 20:
                System.out.println("с == 20");
                break;

            default:
                System.out.println("с == 15");

        }
    }
}
