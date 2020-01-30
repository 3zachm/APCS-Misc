import java.util.Scanner;
public class RPS {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Specify Rock, Paper, or Scissors.");
        String user = in.nextLine();
        String[] objects = { "Rock", "Paper", "Scissors" };
        int length = objects.length;
        int rand = (int) (Math.random() * length);
        String RNG = objects[rand];
        int check = 0;
        while (check==0) {
            if (RNG.equalsIgnoreCase("Rock")) {
                check++;
                if (user.equalsIgnoreCase("Rock")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou tie!");
                }
                if (user.equalsIgnoreCase("Paper")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou win!");
                }
                if (user.equalsIgnoreCase("Scisors")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou lose!");
                }
            }
            else if (RNG.equalsIgnoreCase("Paper")) {
                check++;
                if (user.equalsIgnoreCase("Rock")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou lose!");
                }
                if (user.equalsIgnoreCase("Paper")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou tie!");
                }
                if (user.equalsIgnoreCase("Scisors")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou win!");
                }
            }
            else if (RNG.equalsIgnoreCase("Scisors")) {
                check++;
                if (user.equalsIgnoreCase("Rock")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou win!");
                }
                if (user.equalsIgnoreCase("Paper")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou lose!");
                }
                if (user.equalsIgnoreCase("Scisors")) {
                    System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou tie!");
                }
            }
            else {
                System.out.println("Please enter a valid choice");
            }
        }
            /*
            *if (user == "Rock" &&  RNG == "Rock") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou tie!");
            *if (user == "Rock" &&  RNG == "Paper") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou lose!");
            *if (user == "Rock" &&  RNG == "Scisors") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou win!");
            *if (user == "Paper" &&  RNG == "Paper") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou tie!");
            *if (user == "Paper" &&  RNG == "Rock") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou win!");
            *if (user == "Paper" &&  RNG == "Scisors") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou lose!");
            *if (user == "Scisors" &&  RNG == "Scisors") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou tie!");
            *if (user == "Scisors" &&  RNG == "Paper") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou win!");
            *if (user == "Scisors" &&  RNG == "Rock") System.out.println("\nYou: " + user + "\nComputer:" + RNG + "\n\nYou lose!");
            */
        in.close();
    }
}