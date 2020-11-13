package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // root gets it from here
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER); // this puts in center
//        root.setVgap(30);
//        root.setHgap(30);
//
//        Label greeting = new Label("welcome to javafx");
//        greeting.setTextFill(Color.GREEN); // this will set the the color to green
//        greeting.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD,12 )); // this sets the fontname,height and color
//        root.getChildren().add(greeting); // this adds the title to grid plane on the title screen
//        // first call root
//        // then call get childern method
//        // add(greeting)
//        // java fx will be on center


        primaryStage.setTitle("Hello JavaFx"); // this sets the title for java fx
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
