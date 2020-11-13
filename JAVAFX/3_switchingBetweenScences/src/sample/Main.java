package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
// this will show the screens
// windows will show the stages
// scence 1 and scence 2 will show the scences

 Stage windows;
 Scene scene1,scence2;

    public static void main(String[] args) {
          launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
windows = primaryStage; // windows will be set to primary stage so its easy to remeber what stage is what
Label label1 = new Label("welcome to the first scence");
Button button1 = new Button(" go to scence 2");
button1.setOnAction(e->windows.setScene(scence2)); // set the scence to scence 2
// to set a scence e is the event handelr then go to windows
        VBox layout1 = new VBox(20); // create a vbox layout
        layout1.getChildren().addAll(label1,button1); // this adds everything

        scene1 = new Scene(layout1,200,200);

// button 2

        Button button2 = new Button("go to scence1"); // add new button
        button2.setOnAction(e->windows.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scence2 = new Scene(layout2,600,600);
        windows.setScene(scene1);
        windows.setTitle("this is a test ");
        windows.show();



    }



}
