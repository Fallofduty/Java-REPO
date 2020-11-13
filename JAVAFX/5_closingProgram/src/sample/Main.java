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


    public static void main(String[] args) {
          launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
windows = primaryStage;


     windows = primaryStage;
     windows.setTitle("this is a test");

     windows.setOnCloseRequest(e->{
         e.consume(); // we got it from here we will take care of it only clicking yes will close yet // this overwrites the method
         closeProgram();}); // this even if closed button is clicked the program will close.
     var button = new Button("click me");
     button.setOnAction(e->closeProgram());

     StackPane layout = new StackPane();
     layout.getChildren().add(button);
     windows.setScene(new Scene(layout,300,400));
     windows.show();



    }
private void closeProgram(){
    boolean answer = confirmbox.display("title","are you sure you want to exist");
    if(answer){
        windows.close();
    }

}


}
