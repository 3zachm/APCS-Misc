public class Main {
    public static void main(String[] args) {
        final int ROWS = 5;
        final int COLUMNS = 7;
        int[][] values = new int[ROWS][COLUMNS];
        
        System.out.println("Array:");
        for (int i=0; i<5; i++){
            for (int j =0; j<7; j++){
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
}