public class ExpresionTester {
    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int c = 15;
        double d = 6;
        double doubleWithCheese = 24.0;

        System.out.println(a + c % 6);
        System.out.println(a + c % d);
        System.out.println(b / d * doubleWithCheese - b / a);
        System.out.println(0 % 12);
        System.out.println(0 % 15);
        System.out.println(a % b);
        System.out.println(a % c);
        System.out.println(c % a);
        System.out.println(b % c / a * d + 1 % c);
        //System.out.println(c % 0);
    }
}