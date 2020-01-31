public abstract class Shape {
    private String name;

    public Shape() {
        this.name = "";
    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

    public double semiPerimeter() {
        return perimeter() / 2;
    }

    public String name() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + name() + "'" +
            "}";
    }
}
   