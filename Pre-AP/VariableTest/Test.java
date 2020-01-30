import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        int x = 0;
        Scanner yeet = new Scanner(System.in);

        while(x==0) {
            System.out.println("Yeet");
            String y = yeet.nextLine();
            if (y.equalsIgnoreCase("yeet")) {
                    x++;
                }
            else {
                System.out.println("WeirdChamp");
            }
        }
        yeet.close();
    }
}