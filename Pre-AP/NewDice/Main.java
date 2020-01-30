public class Main {
    public static void main(String []args) {
        Die d1 = new Die();
        int x = 1;
        int sum = 0;
        while (x < 100) {
            int result = d1.roll();
            System.out.print(result + " ");
            sum += result;
            //System.out.println("\"" + sum + "\"");
            x++;
        }
        double avg = (double)sum/x;
        System.out.println("\n\nTotal: " + sum + "\nAverage: " + avg);
    }
}