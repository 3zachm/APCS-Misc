import java.util.ArrayList;

public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(new Circle(10, "ayaya"));
        list.add(new Square(5, "ayaya2"));
        list.add(new Octagon(10, 5, "ayaya3"));
        list.add(new Circle(15, "ayaya4"));
        list.add(new Square(50, "ayaya5"));
        list.add(new Octagon(20, 15, "ayaya6"));
    }
}