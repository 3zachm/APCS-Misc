import java.util.ArrayList;

public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<Shape>();
        Shape a = new Circle(10, "ayaya");
        Shape ay = new Square(5, "ayaya2");
        Shape aya = new Octagon(10, 5, "ayaya3");
        Shape ayay= new Circle(15, "ayaya4");
        Shape ayaya = new Square(50, "ayaya5");
        Shape ayayaa = new Octagon(20, 15, "ayaya6");
        list.add(a);
        list.add(ay);
        list.add(aya);
        list.add(ayay);
        list.add(ayaya);
        list.add(ayayaa);

        System.out.println("Listing toString()s\n");
        listToStrings(list);
        listInfo(list);

    }

    public static void listToStrings(ArrayList<Shape> list) {
        for (int i = 0; list.size() > i; i++) {
            System.out.println(list.get(i) + "\n");
        }
    }

    public static void listInfo(ArrayList<Shape> list) {
        for (Shape s : list) {
            System.out.println("{" +
            " name='" + s.name() + "'" +
            ", area='" + s.area() + "'" +
            ", perimeter='" + s.perimeter() + "'" +
            "}");
        }
    }
}