package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    // this interface is nedded for implmenting interface

    public static void main(String[] args) {
        launch(args); // method inside applicastion class
        // launch(args)==> goes to application
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello JavaFx");
       Button  button = new Button("click me");
        button.setOnAction(event -> {
            System.out.println("you clicked me"); // this is passing lambda function
        }); // this will be on the action event button

        var button_2= new Button("this is 2nd button");
//        button_2.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("you clicked button 2");
//                // this is annoymys function
//            }
//        });
button_2.setOnAction(e-> System.out.println("you clicked me")); // this is the function that will be excuted simple and clean

        var layout = new StackPane();
       // layout.getChildren().add(button);
        layout.getChildren().add(button_2);
        var scence = new Scene(layout,300,250);
        primaryStage.setScene(scence);
        primaryStage.show();
    }



}
