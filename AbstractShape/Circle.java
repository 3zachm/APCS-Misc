public class Circle extends Shape {
    private double radius;

    public Circle(double circleRadius, String circleName) {
        super(circleName);
        radius = circleRadius;
    }

    public double perimeter() { 
        return 2 * Math.PI * radius; 
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "{" +
            " radius='" + getRadius() + "'" + ", name='" + super.getName() + "'" +
            "}";
    }
}
