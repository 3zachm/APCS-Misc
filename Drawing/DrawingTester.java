import javax.swing.JFrame;
public class DrawingTester {
    public static void main(String[]args) {
        JFrame frame = new JFrame();
        
        frame.setSize(1000, 800);
        frame.setTitle("VM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Drawing picture = new Drawing();
        frame.add(picture);
        frame.setVisible(true);
    }
}
