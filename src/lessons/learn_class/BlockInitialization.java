package lessons.learn_class;

public class BlockInitialization {
    public static void main(String[] args) {
        Block block1 = new Block(5);

        Block block2 = new Block(7);

    }
}

class Block {
    private int age;

    static {
        System.out.println("Static block initialization");
    }

    {
        System.out.println("Non-static block initialization");
    }

    public Block(int age) {
        System.out.println("Constructor");
        this.age = age;
    }
}
