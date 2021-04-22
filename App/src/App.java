import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("consultorio 1.0.1");
        Button btn = new Button();
        btn.setText("inicio");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("inicio");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        stage.getIcons().add(new Image("https://img.icons8.com/officel/80/000000/pancake.png"));
        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }
}
