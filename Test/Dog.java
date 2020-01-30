public class Dog {
    private int x;
    private int y;

    public Dog() {
        x = 0;
        y = 0;
    }

    public Dog(int posX, int posY) {
        x = posX;
        y = posY;
    }

    public void moveUp() {
        y = y + 1;
    }

    public int getPosX() {
        return x;
    }

    public int getPosY() {
        return y;
    }
}