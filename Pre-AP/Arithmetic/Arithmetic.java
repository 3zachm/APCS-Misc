package Arithmetic;
import java.util.Scanner;

public class Arithmetic 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a non-decimal number:");
        int number = in.nextInt();
        in.nextLine();
        int modulo = number%2;
        if (modulo == 0) {
            System.out.println("Your number is even!");
        }
        else 
        {
            System.out.println("Your number is odd!");
        }
        in.close();
    }

}