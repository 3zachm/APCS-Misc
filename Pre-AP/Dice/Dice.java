public class Dice {

    private int faceValue;
    private int numSides;

    public Dice() {
        faceValue = 1;
        numSides = 6;
    }
    public Dice(int sides) {
        if (sides < 4) {
            System.out.println("Dice must be at least 4 sides.");
        }
        else {
            numSides = sides;
        }
        faceValue = 1;
    }
    public int getFaceValue() {
        return faceValue;
    }
    public int getSide() {
        return numSides;
    }
    public int roll() {
        double rng = (Math.random()*numSides+1);
        int number = (int) rng;
        faceValue = number;
        return faceValue;
    }
    public String toString() {
        return "Number of sides: " + numSides + "\nFace Value: " + faceValue;
    }
}