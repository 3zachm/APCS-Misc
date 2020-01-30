package VariableTest;
//import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class VariableTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Coin");
        Button btn = new Button();
        btn.setText("Flip it");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                int x = 0;
                int heads = 0;
                int tails = 0;
                int flip = 100;
                // System.out.println(flip); 
                while (x <= flip - 1) {
                //for (int i = 0; i < flip; i++) {
                if (Math.random() < 0.5) // retrieves a number from the function and tests if it is in the upper or lower
                {
                    heads++; // increases heads count
                    btn.setText("Heads");
                }   
                else 
                {
                    tails++; // increases tails count
                    btn.setText("Tails");
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
                }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}