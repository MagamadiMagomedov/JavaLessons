package homeworks;

public class Student {
    private int studyAge;
    private int age;
    private int grant;

    public Student(int newStudyage, int newAge, int newGrant) {

        if (newStudyage < 0) {
            studyAge = 0;
        } else {
            studyAge = newStudyage;
        }
        if (newAge < 0) {
            age = 0;
        } else {
            age = newAge;
        }
        if (newGrant < 0) {
            grant = 0;
        } else {
            grant = newGrant;
        }

    }

    public Student(int newAge) {
        studyAge = 2;
        age = 21;
        grant = 2000;

    }

    public void setStudyAge(int newStudyAge) {
        if (newStudyAge < 0) {
            studyAge = 0;
        } else {
            studyAge = newStudyAge;
        }
    }

    public int getStudyAge() {
        return studyAge;
    }


    public void print() {
        System.out.println("Study Age = " + studyAge + "\tAge = " + age + "\tSalary = " + grant);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student muller = new Student(2, 21, 2000);

        int mullerstudyage = muller.getStudyAge();

        muller.setStudyAge(3);

        int mullerStudyAge = muller.getStudyAge();

        System.out.println(mullerStudyAge);

        Student elena = new Student(1, 19, 2002);
    }

}

