import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {

    public static void display(String title, String message) {
        Stage window = new Stage();
        // block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        // message
        Label label = new Label();
        label.setText(message);
        // button text
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> window.close());
        // layout for scene
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        // display window and wait for it to be closed before returning
        window.setScene(scene);
        window.showAndWait();
    }

}