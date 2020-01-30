package ArrayTester;
import java.util.Scanner;

public class ArrayTester {
    public static void main(String args[]) {
        String scoresIn;
        String vector[];
        double sum = 0;
        Scanner in = new Scanner(System.in);

        /*  int[] students = new int[]{ 43, 694, 493, 684, 80};
        *   System.out.println("The array holds " + students.length + " integers");
        *
        *  for (int x = 0; x < students.length; x++) {
        *      System.out.println(students[x]); // *for* each integer in the array, print it in this format.
        *  }
        */
        System.out.println("How many test scores do you want to recieve the average for?");
        int amount = in.nextInt();
        in.nextLine();
        double scores[] = new double[amount];
        System.out.println("\nPlease enter " + amount + " (non-)decimal numbers for your last test scores.\nPlease seperate each one with a comma (one space after comma)."); // actually a string, will be parsed
        scoresIn = in.nextLine();
        vector = scoresIn.split(", "); // splits string to be place into the array
        int sstring = 0;
        for(String vector2 : vector) { // vector2 is only created for the 'array for loop' method
            scores[sstring] = Double.parseDouble(vector[sstring]);
            // System.out.println(vector2);
            // Syestem.out.println(sstring);
            sstring++;
        }

        int sdouble = 0;
        for (double s : scores) { 
            //System.out.println(scores[sdouble]);
            sum += s;
            sdouble++;
        }
        double average = (sum/sdouble);
        System.out.println("\nThe average of your test scores is " + average);
        in.close();
    }
}