package lessons.learn_class;

public class RombsAndTriangles {

    //    access_modifier void(or return type) name(verb) {body}

    public int countCorners(int rombs, int triangles) {

        int corners = 0;

        if (rombs > 0 && triangles < 10000) {
            corners = rombs * 4 + triangles * 3;
        }

        return corners;
    }
}

class TestRombsAndTriangles {
    public static void main(String[] args) {
        RombsAndTriangles rat = new RombsAndTriangles();

        int result = rat.countCorners(4, 3);

        System.out.println(result);
    }
}