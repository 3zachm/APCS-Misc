import java.util.Scanner;
/*
 * This is absolute spaghetti code...
 */
public class TicTacToe {
    public static void main(String[] args) {
        String A1 = "-";
        String B1 = "-";
        String C1 = "-";
        String A2 = "-";
        String B2 = "-";
        String C2 = "-";
        String A3 = "-";                    
        String B3 = "-";
        String C3 = "-";
        int move = 1;
        int win = 0;
        String input;

        Scanner in = new Scanner(System.in);
        System.out.println("Utilize A1, B1, C1, A2, B2, C2, A3, B3, or C3 to play.\nThe column letter is first, followed directly by the row letter.");        
        while (move < 10)

            if (move % 2 == 0){
                System.out.println("   A   B   C ");
                System.out.println("1  " + A1 + " | " + B1 + " | " + C1 + " ");
                System.out.println("  ---|---|---");
                System.out.println("2  " + A2 + " | " + B2 + " | " + C2 + " ");
                System.out.println("  ---|---|---");
                System.out.println("3  " + A3 + " | " + B3 + " | " + C3 + " ");
                System.out.println("Player O, make a move.");
                input = in.nextLine();
                if (input.equalsIgnoreCase("A1")) {
                    if (!A1.equalsIgnoreCase("-")) {
                        System.out.println("The top left box has been filled aleady.");
                    }
                    else {
                        A1 = "O";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("B1")) {
                    if (!B1.equalsIgnoreCase("-")) {
                        System.out.println("The top center box has been filled aleady.");
                    }
                    else {
                        B1 = "O";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("C1")) {
                    if (!C1.equalsIgnoreCase("-")) {
                        System.out.println("The top right box has been filled aleady.");
                    }
                    else {
                        C1 = "O";
                        move++;
                    }
                } 
                else if (input.equalsIgnoreCase("A2")) {
                    if (!A2.equalsIgnoreCase("-")) {
                        System.out.println("The middle left box has been filled aleady.");
                    }
                    else {
                        A2 = "O";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("B2")) {
                    if (!B2.equalsIgnoreCase("-")) {
                        System.out.println("The middle center box has been filled aleady.");
                    }
                    else {
                        B2 = "O";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("C2")) {
                    if (!C2.equalsIgnoreCase("-")) {
                        System.out.println("The middle right box has been filled aleady.");
                    }
                    else {
                        C2 = "O";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("A3")) {
                    if (!A3.equalsIgnoreCase("-")) {
                        System.out.println("The bottom left box has been filled aleady.");
                    }
                    else {
                        A3 = "O";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("B3")) {
                    if (!B3.equalsIgnoreCase("-")) {
                        System.out.println("The bottom center box has been filled aleady.");
                    }
                    else {
                        B3 = "O";
                        move++;
                    }
                }               
                else if (input.equalsIgnoreCase("C3")) {
                    if (!C3.equalsIgnoreCase("-")) {
                        System.out.println("The bottom right box has been filled aleady.");
                    }
                    else {
                        C3 = "O";
                        move++;
                    }
                }
                else {
                    System.out.println("Not a valid column");
                }
            }
            else {
                System.out.println("   A   B   C ");
                System.out.println("1  " + A1 + " | " + B1 + " | " + C1 + " ");
                System.out.println("  ---|---|---");
                System.out.println("2  " + A2 + " | " + B2 + " | " + C2 + " ");
                System.out.println("  ---|---|---");
                System.out.println("3  " + A3 + " | " + B3 + " | " + C3 + " ");
                System.out.println("Player X, make a move.");
                input = in.nextLine();
                if (input.equalsIgnoreCase("A1")) {
                    if (!A1.equalsIgnoreCase("-")) {
                        System.out.println("The top left box has been filled aleady.");
                    }
                    else {
                        A1 = "X";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("B1")) {
                    if (!B1.equalsIgnoreCase("-")) {
                        System.out.println("The top middle box has been filled aleady.");
                    }
                    else {
                        B1 = "X";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("C1")) {
                    if (!C1.equalsIgnoreCase("-")) {
                        System.out.println("The top right box has been filled aleady.");
                    }
                    else {
                        C1 = "X";
                        move++;
                    }
                } 
                else if (input.equalsIgnoreCase("A2")) {
                    if (!A2.equalsIgnoreCase("-")) {
                        System.out.println("The middle left box has been filled aleady.");
                    }
                    else {
                        A2 = "X";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("B2")) {
                    if (!B2.equalsIgnoreCase("-")) {
                        System.out.println("The middle center box has been filled aleady.");
                    }
                    else {
                        B2 = "X";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("C2")) {
                    if (!C2.equalsIgnoreCase("-")) {
                        System.out.println("The middle right box has been filled aleady.");
                    }
                    else {
                        C2 = "X";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("A3")) {
                    if (!A3.equalsIgnoreCase("-")) {
                        System.out.println("The bottom left box has been filled aleady.");
                    }
                    else {
                        A3 = "X";
                        move++;
                    }
                }
                else if (input.equalsIgnoreCase("B3")) {
                    if (!B3.equalsIgnoreCase("-")) {
                        System.out.println("The bottom center box has been filled aleady.");
                    }
                    else {
                        B3 = "X";
                        move++;
                    }
                }               
                else if (input.equalsIgnoreCase("C3")) {
                    if (!C3.equalsIgnoreCase("-")) {
                        System.out.println("The bottom right box has been filled aleady.");
                    }
                    else {
                        C3 = "X";
                        move++;
                    }
                }
                else {
                    System.out.println("Not a valid column");
                }
                if (A1.equals(B1) && B1.equals(C1)) {       // row 1
                    if (A1.equalsIgnoreCase("-") || B1.equalsIgnoreCase("-") || C1.equalsIgnoreCase("-")) {

                    }
                    else if (A1.equalsIgnoreCase("X")) {
                        System.out.println("\nPlayer X wins!");
                        win++;
                    }
                    else {
                        System.out.println("\nPlayer O wins!");
                    }
                }
                else if (A2.equals(B2) && B2.equals(C2)) {  // row 2
                    if (A2.equalsIgnoreCase("-") || B2.equalsIgnoreCase("-") || C2.equalsIgnoreCase("-")) {

                    }
                    else if (A2.equalsIgnoreCase("X")) {
                        System.out.println("\nPlayer X wins!");
                        win++;
                    }
                    else {
                        System.out.println("\nPlayer O wins!");
                    }
                }
                else if (A3.equals(B3) && B3.equals(C3)) {  // row 3
                    if (A3.equalsIgnoreCase("-") || B3.equalsIgnoreCase("-") || C3.equalsIgnoreCase("-")) {

                    }
                    else if (A3.equalsIgnoreCase("X")) {
                        System.out.println("\nPlayer X wins!");
                        win++;
                    }
                    else {
                        System.out.println("\nPlayer O wins!");
                    }
                }
                else if (A1.equals(A2) && A2.equals(A3)) {  // column A
                    if (A1.equalsIgnoreCase("-") || A2.equalsIgnoreCase("-") || A3.equalsIgnoreCase("-")) {

                    }
                    else if (A1.equalsIgnoreCase("X")) {
                        System.out.println("\nPlayer X wins!");
                        win++;
                    }
                    else {
                        System.out.println("\nPlayer O wins!");
                    }
                }
                else if (B1.equals(B2) && B2.equals(B3)) {  // column B
                    if (B1.equalsIgnoreCase("-") || B2.equalsIgnoreCase("-") || B3.equalsIgnoreCase("-")) {

                    }
                    else if (A1.equalsIgnoreCase("X")) {
                        System.out.println("\nPlayer X wins!");
                        win++;
                    }
                    else {
                        System.out.println("\nPlayer O wins!");
                    }
                }
                else if (C1.equals(C2) && C2.equals(C3)) {  // column C
                    if (C1.equalsIgnoreCase("-") || C2.equalsIgnoreCase("-") || C3.equalsIgnoreCase("-")) {

                    }
                    else if (C1.equalsIgnoreCase("X")) {
                        System.out.println("\nPlayer X wins!");
                        win++;
                    }
                    else {
                        System.out.println("\nPlayer O wins!");
                    }
                }
                else if (A1.equals(B2) && B2.equals(C3)) {  // diagonal A1 to C1
                    if (A1.equalsIgnoreCase("-") || B2.equalsIgnoreCase("-") || B3.equalsIgnoreCase("-")) {

                    }
                    else if (A1.equalsIgnoreCase("X")) {
                        System.out.println("\nPlayer X wins!");
                        win++;
                    }
                    else {
                        System.out.println("\nPlayer O wins!");
                    }
                }
                else if (A3.equals(B2) && B2.equals(C1)) {  // diagonal A3 to C1
                    if (A3.equalsIgnoreCase("-") || B2.equalsIgnoreCase("-") || C1.equalsIgnoreCase("-")) {

                    }
                    else if (A3.equalsIgnoreCase("X")) {
                        System.out.println("\nPlayer X wins!");
                        win++;
                    }
                    else {
                        System.out.println("\nPlayer O wins!");
                    }
                }
                if (win == 1) {
                    move = 10;
                }   
            }
        System.out.println("   A   B   C ");
        System.out.println("1  " + A1 + " | " + B1 + " | " + C1 + " ");
        System.out.println("  ---|---|---");
        System.out.println("2  " + A2 + " | " + B2 + " | " + C2 + " ");
        System.out.println("  ---|---|---");
        System.out.println("3  " + A3 + " | " + B3 + " | " + C3 + " ");
        if (win == 0) {
            System.out.println("It's a draw!");  
        }
        in.close();
    }
}