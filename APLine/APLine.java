public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getSlope() {
        return ((double)a/(double)b)*(-1);
    }
    public boolean isOnLine(int x, int y) {
        if ((a*x) + (b*y) + c == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public void eSet (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}