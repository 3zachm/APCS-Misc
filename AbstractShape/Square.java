public class Square extends Shape {
    private double side;
    
    public Square(double squareSide, String squareName) {
        super(squareName);
        side = squareSide;
    }

    public double perimeter() {
         return 4 * side; 
    }
    
    public double area() {
         return side * side; 
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public String toString() {
        return "{" +
            " side='" + getSide() + "'" 
            + ", name='" + super.getName() + "'" +
            "}";
    }

}