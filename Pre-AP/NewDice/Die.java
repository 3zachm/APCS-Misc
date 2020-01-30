public class Die {
    private int numSides, faceValue;
    private String color;

    public Die() {
        numSides = 6;
        faceValue = 0;
        color = "N/A";
    }

    public Die(int numSides, int faceValue, String color) {
        if (numSides < 3) {
            numSides = 6;
            System.out.println("Set to default 6 due to invalid side count.");
        }
        else
        {
            this.numSides = numSides;
        }
        this.numSides = numSides;
        this.faceValue = faceValue;
        this.color = color;
    }

    public int getFaceValue() {
        return faceValue;
    }
    public int getSides() {
        return numSides;
    }
    public String getColor() {
        return color;
    }

    public int roll() {
        double rng = (Math.random()*numSides+1);
        int number = (int) rng;
        faceValue = number;
        return faceValue;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Value: " + faceValue + "\nSides: " + numSides + "\nColor: " + color;
    }
}