public class APLineT {
    public static void main(String[] args) {
        APLine line = new APLine(10, 5, 0); 

        System.out.println("The first line has a slope of " + line.getSlope());
        if (line.isOnLine(5, 10) == true) {
            System.out.println("The point (5, 10) is on the line.");
        }
        else {
            System.out.println("The point (5, 10) is not on the line.");
        }
        if (line.isOnLine(1, -2) == true) {
            System.out.println("The point (1, -2) is on the line.");
        }
        else {
            System.out.println("The point (1, -2) is not on the line.");
        }
    }
}
