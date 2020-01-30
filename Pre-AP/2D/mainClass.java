import javax.swing.JFrame;
import java.awt.Rectangle;
public class mainClass {
    public static void main(String[]args) {
        JFrame window = new JFrame();
        window.setSize(640,480);
        window.setTitle("title of my frame");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        Rectangle rect = new Rectangle(5, 10, 300, 100); //(x, y, width, height)
        

    }
}
