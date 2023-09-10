package lessons.learn_class;

public class LearnConstants {
    public static void main(String[] args) {
        final int a = 10;

//        a = 15;

        Constants obj = new Constants(18);
        Constants obj1 = new Constants(15, 5.4f);
        Constants obj2 = new Constants(5.4f);
    }
}

class Constants {
    private final int age; // non-static constant
    private float height;

    public static final int COUNT = 15;

    public Constants(int age) {
        this.age = age;
    }

    public Constants(float height) {
        this.height = height;
        this.age = 10;
    }

    public Constants(int age, float height) {
        this.age = age;
        this.height = height;
    }

    public void print() {
//        age = 10;
    }


}
