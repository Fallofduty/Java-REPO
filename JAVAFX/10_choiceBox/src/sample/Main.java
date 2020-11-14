package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
     var  button = new Button("Click me");

    var choiceBox = new ChoiceBox<String>(); // this will only take string nothing else
        String [] list = {"banana","apple","orange"}; // passing the whoel array
        choiceBox.getItems().addAll(list); // passing one thing 
        choiceBox.getItems().add("watermelon");

        choiceBox.setValue("select a value");

     button.setOnAction(e->getChoice(choiceBox));

        var layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);

        windows.setScene(new Scene(layout,300,300));



   // making a greedpane


    //button

     //checkboxes

     windows.show();



    }
    private void getChoice(ChoiceBox<String>choiceBox ){
        String food = choiceBox.getValue();
        System.out.println(food);
    }


}



