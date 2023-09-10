package lessons.learn_class;

public class Person {
    private int age;//field age type int
    private int height;
    private int weight;
    private int countChildren;

    public Person(int newAge, int newHeight, int newWeight, int newCountChildren) {//incoming params
        weight = newWeight;
        height = newHeight;
        countChildren = newCountChildren;
    }

    public Person(int newWeight) {
        age = 20;
        weight = newWeight;
        height = 150;
        countChildren = 2;
    }

    /*public Person(int newAge) {
        age = newAge;
        weight = 110;
        height = 150;
        countChildren = 2;
    }*/

    public Person(int newAge, int newHeight) {

        if (newAge < 0) {
            age = 0;
        } else {
            age = newAge;
        }
        weight = 120;
        height = newHeight;
        countChildren = 3;
    }

    //    access_modifier void(or return type) name(verb) {body}
    public void setAge(int newAge) {//setter
        if (newAge < 0) {
            age = 0;
        } else {
            age = newAge;
        }
    }

    public int getAge() {//getter
        return age;
    }

    public void print() {
        System.out.println("Age = " + age + "\tHeight = " + height + "\tWeight = " + weight);
    }

}

class TestPerson {
    public static void main(String[] args) {
//        datatype(class_name) reference_name = new datatype(params or absent);
        Person john = new Person(20, 150);//outcoming params
//        Person john = new Person();//outcoming params

        john.setAge(21);

        int johnAge = john.getAge();//21

//        System.out.println(johnAge);

        john.print();

//        int value = -20;

      /*  if (value < 0) {
            john.age = 0;
        } else {
            john.age = value;
        }
        john.weight = 80;
        john.countChildren = 2;
        john.height = 150;*/


        Person ben = new Person(30, 180, 90, 3);

        ben.setAge(31);

        /*ben.age = 30;
        ben.height = 180;
        ben.weight = 90;
        ben.countChildren = 3;*/

//        int a = 20;
    }
}
