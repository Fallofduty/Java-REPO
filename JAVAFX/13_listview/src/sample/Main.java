package sample;
import javafx.application.Application;
import javafx.beans.Observable;
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
 ListView<String> listView = new ListView<>();


    public static void main(String[] args) {
          launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
windows = primaryStage;


     windows = primaryStage;
     windows.setTitle("this is a test");
     var  button = new Button("Click me");

     listView.getItems().addAll("iron man","titantic","contact","surrogate"); // adding items all together
     listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);  //  this will let metiple items to be added

        button.setOnAction(e->buttonClicked());


        var layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(listView,button);


        windows.setScene(new Scene(layout,300,300));



   // making a greedpane


    //button

     //checkboxes

     windows.show();



    }
    //print out
    private void buttonClicked(){
        StringBuilder Message = new StringBuilder();
        String[] movies; // hwat ever the options is being get will be converted here
                movies = listView.getSelectionModel().getSelectedItems().toArray(new String[0]); // will store inside list of movies
        for(String m:movies){
            Message.append(m).append('\n'); // find movies and add it here
        }
        System.out.println(Message); // print out movie results
    }


}



