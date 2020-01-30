import java.util.Scanner;

public class DiceTester {
    public static void main(String[]args) {
        
        int count = 1; // if the test total roll println is commented out, this will serve no function
        double sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("How many sides would you like the first die to have?");
        int sides = in.nextInt();
        in.nextLine();
        // creating two dice
        Dice die = new Dice(sides); // assumes default faceValue is already assigned by constructor later in code
        Dice die2 = new Dice();
        // testing accessors
        System.out.println("\nThe first die has " + die.getSide() + " sides and a default face value of " + die.getFaceValue());
        System.out.println("The second die has " + die2.getSide() + " sides and a default face value of " + die2.getFaceValue());

        System.out.println("\nHow many times do you want to roll the dice?");
        int rolls = in.nextInt();
        int rolls2 = rolls;
        int[] results = new int[rolls];
        int arrayCount = 0;
        //testing roll function
        while (rolls > 0) {
            int roll = die.roll();
            int roll2 = die2.roll();
            int allRoll = roll + roll2;
            //System.out.println("Roll #" + count + " Total: " + allRoll); // made previously before bubble sort method was utilized
            results[arrayCount] = allRoll; 
            sum += allRoll; // used later for averaging
            count++;
            rolls--;
            arrayCount++;
        }
        System.out.println("\nBubble sorting results...\n");
        // bubble sort algorithim (i didn't make this)
        int n = results.length; // taken from an already pre-existing java object provided by Rajat Mishr 
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (results[j] > results[j+1])
                {
                    // swap temp and results[i]
                    int temp = results[j];
                    results[j] = results[j+1];
                    results[j+1] = temp;
                }
        // printing bubble sort result, also referenced from Mishr's code
        int m = results.length;
        for (int i=0; i<m; ++i)
            System.out.print(results[i] + " ");
        System.out.println();

        double average = sum/rolls2;
        System.out.print("\nAverage: ");
        System.out.printf("%.2f", average); // formatted output, hundreths
        System.out.println("\n\nCurrent dice statistics:");
        System.out.println("Die 1:\n" + die + "\nDie 2:\n" + die2 + "\n");
        System.out.println("Creating a die with 2 sides, which should be set to the default value:");
        Dice die3 = new Dice(2); // should default to fallback value
        System.out.println("The die has a side value of " + die3.getSide());
        in.close();
    }
}