public class Octagon extends Shape {
    private double apothem;
    private double side;
    
    public Octagon(double side, double apothem, String name) {
        super(name);
        this.side = side;
    }

    public double perimeter() {
         return 8 * side; 
    }
    
    public double area() {
         return apothem * perimeter(); 
    }

    public double getApothem() {
        return this.apothem;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public String toString() {
        return "{" +
            " apothem='" + getApothem() + "'" +
            ", side='" + getSide() + "'" +
            ", name='" + super.name() + "'" +
            "}";
    }

}