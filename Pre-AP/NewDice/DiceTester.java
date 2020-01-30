import java.util.Arrays;
/**
 * The DiceTester class was written to test my Dice class objects.
 *
 * @author Mrs. Mirras
 * @version 4/29/2019
 */
public class DiceTester
{
    public static void main(String[] args)
    {
        // create at least two Dice objects.  (Hint: use "new")
        // Use the no arg constructor for one Dice and the 3 arg constructor 
        // for the other.
        Die d1 = new Die();
        Die d2 = new Die(6, 0, "Blue");
        // Use System.out.println() to display each Dice object.  
        // Make sure it looks correct.
        System.out.println("D1 values:\n" + d1 + "\nD2 values:\n" + d2);
        // Test the getters using System.out.println()
        System.out.println("The face value of d1 is " + d1.getFaceValue());
        System.out.println("The number of sides of d1 is " + d1.getSides());
        System.out.println("The color of d1 is " + d1.getColor());
        // Test roll() using a loop (for loop or while loop).  println() each roll() and
        // make sure the results seem random.
        int x = 0;
        while(x<10) {
            d1.roll();
            System.out.println(d1.getFaceValue());
            x++;
        }
        // Try to make a 2 sided Dice and test your error checking.
        Die d3 = new Die(2, 0, "Color");
        System.out.println("Number of Sides of D3: " + d3.getSides());
        
        // Challenges:
        Die d4 = new Die(20, 0, "Blue");
        int y = 0;
        double sum = 0;
        System.out.println("Testing 20 sided die.");
        while(y<5) {
            d4.roll();
            System.out.println(d4.getFaceValue());
            sum += d4.getFaceValue();
            y++;
        }
        double average = sum/(double)y;
        System.out.println("\nIt averaged a value of " + average);
        
        Die d5 = new Die(6, 0, "Blue");
        int z = 0;
        double sum2 = 0;
        int num[] = new int[6];
        System.out.println("\nTesting 6 sided die.");
        while(z<100) {
            d5.roll();
            sum2 += d5.getFaceValue();
            if (d5.getFaceValue()==1) {
                num[0]++;
                z++;
            } 
            else if (d5.getFaceValue()==2) {
                num[1]++;
                z++;
            }
            else if (d5.getFaceValue()==3) {
                num[2]++;
                z++;
            } 
            else if (d5.getFaceValue()==4) {
                num[3]++;
                z++;
            } 
            else if (d5.getFaceValue()==5) {
                num[4]++;
                z++;
            } 
            else if (d5.getFaceValue()==6) {
                num[5]++;
                z++;
            }  
        }
        double average2 = sum2/(double)z;
        System.out.println("\nIt averaged a value of " + average2);
        System.out.println("Numbers 1-6 appeared accordingly:");
        System.out.println(Arrays.toString(num));
    }
}
