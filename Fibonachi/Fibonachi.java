public class Fibonachi {
    public static void main(String[] args) {
        int x = 0;
        while (x < 100) {
            System.out.println("Attempt " + (x + 1) + ": " + fib(x));
            try {
                Thread.sleep(5);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            x++;
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}