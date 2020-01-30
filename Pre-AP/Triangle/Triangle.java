public class Triangle {
    public int base;
    public int height;

    public Triangle() {
        base = 1;
        height = 1;
    }
    public Triangle(int b, int h) {
        this.base = b;
        this.height = h;
    }
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
    }
    public void setBase(int b) {
        this.base = b;
    }
    public void setHeight(int h) {
        this.height = h;
    }
    public String toString() {
        return "Height: " + height + "\nBase: " + base;
    }
    public double calcArea() {
        return (0.5*(double)(base))*((double)height);
    }
}