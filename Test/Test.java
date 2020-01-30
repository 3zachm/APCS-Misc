public class Test {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Hi");
        Dog dog1 = new Dog();
        System.out.println("Current Pos: " + dog1.getPosX + ", " + dog1.getPosY);
        dog1.moveUp();
    }
}