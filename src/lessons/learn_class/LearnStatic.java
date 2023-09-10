package lessons.learn_class;

public class LearnStatic {
    public static void main(String[] args) {
        //100 objects - array

        GameSoldier soldier1 = new GameSoldier();

//        soldier1.countAlive = 10;
        GameSoldier soldier2 = new GameSoldier();

//        System.out.println(soldier2.countAlive);

//        GameSoldier.countAlive = -15;

//        System.out.println(GameSoldier.countAlive);

//        GameSoldier.setCountAlive(15);

    }
}

class GameSoldier {
    private int age;
    private static int countAlive;

    public static int getCountAlive() {
//        System.out.println(age);
//        setAge(20);
        return countAlive;
    }

    public static void setCountAlive(int countAlive) {
        GameSoldier.countAlive = countAlive;
    }

    public void setAge(int age) {
        setCountAlive(15);
        this.age = age;
    }
}
