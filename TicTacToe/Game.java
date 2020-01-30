import java.util.Scanner;

public class Game {
    public static void main(String[]args) {
        String[][] board = {{"-", "-", "-"},
                            {"-", "-", "-"},
                            {"-", "-", "-"}
                        }; // letters on left side, numbers on top/bottom
        Scanner in = new Scanner(System.in);
        int turn = 0;
        int player = 0;
        String input = "";
        System.out.println("Input moves like \"A1\", being the column letter followed by the row number");
        System.out.println("Board reference with column/row labels:\n");
        System.out.println(" A1 | B1 | C1 \n" +
                           "----|----|----\n" +
                           " A2 | B2 | C2 \n" +
                           "----|----|----\n" +
                           " A3 | B3 | C3 \n");
        while(winCondition(board, turn) == 0 && turn < 9) {
            printBoard(board);
            if (turn % 2 == 0) {
                System.out.println("Player X's move:"); // set player integer, test move method
                player = 1;
            }
            else {
                System.out.println("Player Y's move:");
                player = 2;
            }
            input = in.nextLine();
            for (int i = 0; i < 2; i++) {
                System.out.println("\n");
            }
            if (player == 1 && move(board, input, player) < 9) {
                turn++;
            }
            else if (player == 2 && move(board, input, player) < 9) {
                turn++;
            }
        }
        printBoard(board);
        if (winCondition(board, turn) == 1) {
            System.out.println("X wins!");
        }
        else if (winCondition(board, turn) == 2) {
            System.out.println("O wins!");
        }
        else {
            System.out.println("Tie!");
        }
        in.close();
    }

    public static int winCondition(String[][] array, int turn) {
        int win = 0; // 1 = X wins, 2 = O wins
        if (array[0][0].equals(array[0][1]) && array[0][0].equals(array[0][2]) && !array[0][0].equals("-") || 
            array[0][0].equals(array[1][0]) && array[0][0].equals(array[2][0]) && !array[0][0].equals("-") ||
            array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2]) && !array[0][0].equals("-") ||

            array[0][1].equals(array[1][1]) && array[0][1].equals(array[2][1]) && !array[0][1].equals("-") ||

            array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0]) && !array[0][2].equals("-") ||
            array[0][2].equals(array[1][2]) && array[0][2].equals(array[2][2]) && !array[0][2].equals("-") || 
            array[1][0].equals(array[1][1]) && array[1][2].equals(array[1][2]) && !array[1][0].equals("-") ||
            
            array[2][0].equals(array[2][1]) && array[2][0].equals(array[2][2]) && !array[2][0].equals("-") ) {
                if (turn % 2 == 0) {
                    win = 2;
                }
                else {
                    win = 1;
                }
        } 
        return win;
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < 3; i++){
            System.out.print(" ");
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
                if (j < 2) {
                    System.out.print("| ");
                }
            }
            if (i < 2) {
                System.out.println("\n---|---|---");
            }
        }
        System.out.println("\n");
    }
    
    public static int move(String[][] board, String input, int player) throws IndexOutOfBoundsException {
        String filled = "This spot has been filled aleady.";
        String mark;
        if (player == 1) {
            mark = "X";
        }
        else {
            mark = "O";
        }
        if (input.equalsIgnoreCase("A1")) {
            if (!board[0][0].equalsIgnoreCase("-")) {
                System.out.println(filled);
            }
            else {
                board[0][0] = mark;
                return 0;
            }
        }
        else if (input.equalsIgnoreCase("B1")) {
            if (!board[0][1].equalsIgnoreCase("-")) {
                System.out.println(filled);
            }
            else {
                board[0][1] = mark;
                return 1;
            }
        }
        else if (input.equalsIgnoreCase("C1")) {
            if (!board[0][2].equalsIgnoreCase("-")) {
                System.out.println(filled);
            }
            else {
                board[0][2] = mark;
                return 2;
            }
        } 
        else if (input.equalsIgnoreCase("A2")) {
            if (!board[1][0].equalsIgnoreCase("-")) {
                System.out.println(filled);
            }
            else {
                board[1][0] = mark;
                return 3;
            }
        }
        else if (input.equalsIgnoreCase("B2")) {
            if (!board[1][1].equalsIgnoreCase("-")) {
                System.out.println(filled);
            }
            else {
                board[1][1] = mark;
                return 4;
            }
        }
        else if (input.equalsIgnoreCase("C2")) {
            if (!board[1][2].equalsIgnoreCase("-")) { 
                System.out.println(filled);
            }
            else {
                board[1][2] = mark;
                return 5;
            }
        }
        else if (input.equalsIgnoreCase("A3")) {
            if (!board[2][0].equalsIgnoreCase("-")) {
                System.out.println(filled);
            }
            else {
                board[2][0] = mark;
                return 6;
            }
        }
        else if (input.equalsIgnoreCase("B3")) {
            if (!board[2][1].equalsIgnoreCase("-")) {
                System.out.println(filled);
            }
            else {
                board[2][1] = mark;
                return 7;
            }
        }               
        else if (input.equalsIgnoreCase("C3")) {
            if (!board[2][2].equalsIgnoreCase("-")) {
                System.out.println(filled);
            }
            else {
                board[2][2] = mark;
                return 8;
            }
        }
        else {
            System.out.println(input + " is not a valid location.");
            return 9;
        }
        return 9;
    }
}