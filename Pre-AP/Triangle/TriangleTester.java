public class TriangleTester {
    public static void main(String args[]) {
        // creating two dice objects
        // one with no args, one with two args
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5, 10);
        // displaying toString() of each obj
        System.out.println("t1 values:\n" + t1 + "\nt2 values:\n" + t2);
        // testing accessors
        System.out.println("The base of t1 is " + t1.getBase());
        System.out.println("The height of t1 is " + t1.getHeight());
        // testing calculation
        System.out.println("The area of t1 is " + t1.calcArea());
        System.out.println("The area of t2 is " + t2.calcArea());
        // testing mutators
        t1.setBase(10);
        t2.setHeight(20);
        // confirming changes were successful
        System.out.println("The new base of t1 is " + t1.getBase());
        System.out.println("The new height of t2 is " + t1.getHeight());
    }
}