package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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


   // making a greedpane


     var textBox = new TextField();
     var button = new Button("click me");
     //button.setOnAction(e-> System.out.println(textBox.getText())); // this will get the text from button;
        /*
        ss
        was put it will shpw up
         */
        button.setOnAction(e->isInt(textBox,textBox.getText()));

     var layout = new VBox(10);
     layout.setPadding(new Insets(20,20,20,20));
     layout.getChildren().addAll(textBox,button);

     windows.setScene(new Scene(layout,300,300));
     windows.show();



    }
private boolean isInt(TextField input,String message){
        try{
            int age = Integer.parseInt(input.getText()); // getting the getting text area.
            System.out.println("user is age "+age); // this will get the number from the message
            return true;
        }catch (NumberFormatException e){
            System.out.println("error "+message + " is not a number");
            return false;
        }
}


}
