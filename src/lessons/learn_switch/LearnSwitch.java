package lessons.learn_switch;

public class LearnSwitch {
    public static void main(String[] args) {
        int a = 10;

        int b;
        if (a == 10) {
                System.out.println("b == 15");

            b = 15;
        } else if (a == 15) {
                System.out.println("b == 20");

            b = 20;
        } else if (a == 20) {
            System.out.println("b == 25");

            b = 25;
        } else {
            b = 0;
        }

        switch (a) {
            case 10:
                System.out.println("b == 15");
                b = 15;
               break;
            case 15:
                System.out.println("b == 20");
                b = 20;
                break;
            case 20:
                System.out.println("b == 25");
                b = 25;
                break;

            default:
                System.out.println("b == 0");
                b = 0;
        }


    }
}
