package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main extends Application {
/*
********java fx terminology***********
* enitre window --> called stage
* conent-is called scence Like buttons and widgets
* primary stage is the main window
* primary set stage title
*
 */
    public static void main(String[] args) {
        launch(args); // method inside applicastion class
        // launch(args)==> goes to application
    }

    @Override
    public void start(Stage primaryStage) throws Exception{ //start will be overwirtten
        // this will be the main java fx code
        // setting up button

     //java fx code tutorial
     //1 set the title
        primaryStage.setTitle("Hello JavaFx"); // this sets the title for java f
        //ways to identify button text
       //2 set the buttons or conents for the page
        var button = new Button("click me");
        button.setText("hello world"); // chaging conentn

        var layout = new StackPane(); // set up playout
        layout.getChildren().add(button);// add childern with buttons

        var scence = new Scene(layout,300,250); // select selct

        primaryStage.setScene(scence); // put scence

       // primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show(); // this will show it to stagge
    }



}
