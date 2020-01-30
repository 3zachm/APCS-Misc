public class CoinFlip {
    // @Test
    public static void main(String[] args) {
        int x = 0;
        int heads = 0;
        int tails = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("How many times do you want to flip the coin?");
        int flip = in.nextInt();
        in.nextLine();
        // System.out.println(flip); 
        while (x <= flip - 1) {
        //for (int i = 0; i < flip; i++) {
            if (Math.random() < 0.5) // retrieves a number from the function and tests if it is in the upper or lower
                                     // half of the possible outcomes
            {
                heads++; // increases heads count
            } else {
                tails++; // increases tails count
            }
            x++;
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        double hd = heads;
        double tl = tails;
        double pr = hd / tl * 100 - 100; // percentage of heads
        System.out.printf("%.2f", pr);// formats print output to be to the hundredths place
        System.out.println("% Difference (heads)");
        // System.out.println(tl)
        in.close();
    }}
// "C:\Program Files\Java\jdk1.8.0_131\bin\java.exe" CoinFlip
