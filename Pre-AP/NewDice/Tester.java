public class Tester {
    public static void main(String args[]) {
        int x = 0;
        while(x<=9) {
            double rng = (Math.random()*10+1);
            int number = (int)rng;
            System.out.println(number);
            x++;
        }
    }
}