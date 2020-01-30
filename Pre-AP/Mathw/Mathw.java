import java.util.Scanner;
//import java.lang.Math;

public class Mathw {
    public static void main(String[]args) {
        Scanner aya = new Scanner(System.in);
        int x = 0;
        String wee = "";
        while (x == 0) {
            System.out.println("AYAYA?");
            String ye = aya.nextLine();
            if (ye.trim().length() < 5) {
                System.out.println("Reeeeeeeeeeeeeeee");
                
            }
            else {
                wee = ye;
                x++;
            }
        }
        System.out.println(wee.toLowerCase().substring(3,4));
        if (wee.toLowerCase().substring(3,4).equalsIgnoreCase("y")) {
            int y = 100;
            while (x==1) {
                try {
                    Thread.sleep(y);
                }
                catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.print("AYAYA! ");
                if (y != 0) {
                    y--;
                }
            }
        }
        else {
            System.out.println("ayaya.");
        }
    } 
}