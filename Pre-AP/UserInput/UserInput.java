import java.util.Scanner;
public class UserInput
{
    public static void main(String[]args)
    {
        String userName;
        String testSize;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        userName = in.nextLine();
        System.out.println("Alright " + userName + ", test?");
        testSize = in.nextLine();
        System.out.println(testSize + ", ok.");
        if (Character.isLetter(testSize.charAt(0))){ //Checks if the char favoriteLetter is a letter
            System.out.println("My favorite character is " + testSize + " (Boolean = ture).");
         }
        in.close();//Closes input scanner
    }
}
//FIX CHARACTER CHECKER