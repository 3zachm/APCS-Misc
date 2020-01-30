public class Enhanced {
    public static void main(String[] args) {
        double[] scores = {5, 4, 9, 8, 1, 10};
        // find average with enhanced for
        double sum = 0;

        for (double next : scores) {
            sum += next;            
        }
        double avg = sum/scores.length;
        System.out.print("The average of the array is ");
        System.out.printf ("%.2f\n", avg);;
    }
}