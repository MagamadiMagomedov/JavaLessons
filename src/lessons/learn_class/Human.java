package lessons.learn_class;

public class Human {
    private int salary;
    private int age;
    private int height;

    public Human(int newSalary, int newAge, int newHeight) {
        if (newSalary < 0) {
            salary = 0;
        } else {
            salary = newSalary;
        }
        if (newAge < 0) {
            age = 0;
        } else {
            age = newAge;
        }
        if (newHeight < 0) {
            height = 0;
        } else {
            this.height = newHeight;
        }
    }

   /* public Human(int salary, int age, int height) {
        *//*this.salary = salary;
        this.age = age;*//*
        this(salary, age);
        this.height = height;
    }

    public Human(int salary, int age) {
        this.salary = salary;
        this.age = age;
    }

    public Human(int salary) {
        this.salary = salary;
    }*/

    /*public Human() {
    }*/

    /*public Human(int age, int height) {
        this.age = age;
    }*/

    public void setAge(int age) {//10
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class WithoutFields {

    private int age;

    public WithoutFields(int age) {
        this.age = age;
    }
}

class CheckHuman {
    public static void main(String[] args) {
        Human tomas = new Human(5000, 32, 181);

        tomas.setAge(10);

        System.out.println(tomas.getAge());

        Human john = new Human(5200, 36, 185);

        john.setAge(15);

        int a = 15;

        a = a;

        WithoutFields withoutFields = new WithoutFields(5);
    }
}