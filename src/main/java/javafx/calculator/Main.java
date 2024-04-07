package javafx.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        //Stage stage = new Stage
        //Group root = new Group();
        Scene scene = new Scene(root);

        String css = this.getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(css);

        Image icon = new Image("C:\\Users\\lukia\\Desktop\\Java\\Calculator\\src\\img.png");
        stage.getIcons().add(icon);
        stage.setTitle("Calculator!");

        stage.setScene(scene);
        stage.show();
    }
}
