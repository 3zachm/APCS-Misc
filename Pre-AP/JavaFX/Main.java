import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    Label label = new Label("Choose a thing or something:");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Thing");
        button = new Button("Flip");
        ChoiceBox<String> dropdown = new ChoiceBox<>();

        dropdown.getItems().add("Flip");
        dropdown.getItems().add("No");
        dropdown.setValue("Option 1");
        button.setOnAction(event -> {
            if (dropdown.getValue()=="Flip") {
                if (Math.random() < 0.5) {
                    AlertBox.display("Coin Flip", "Heads");
                } else {
                    AlertBox.display("Coin Flip", "Tails");               
                }
            }
            else {
                AlertBox.display("Okay", "ok");
            }

        });
        BorderPane border = new BorderPane();
        VBox vb = new VBox(10);
        HBox hb = new HBox(10);
        vb.setPadding(new Insets(20, 20, 20, 20));
        vb.getChildren().addAll(dropdown);
        hb.setPadding(new Insets(20, 20, 20, 20));
        vb.getChildren().addAll(button);
        border.setTop(label);
        border.setCenter(vb);
        border.setBottom(hb);
        scene = new Scene(border, 300, 250);
        window.setScene(scene);
        window.show();
    }

}