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
 ComboBox<String> comboBox;


    public static void main(String[] args) {
          launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
windows = primaryStage;


     windows = primaryStage;
     windows.setTitle("this is a test");
     var  button = new Button("Click me");

    comboBox = new ComboBox<>();
    comboBox.getItems().addAll(
            "good will hunting",
            "spiderman into spiderverse",
            "blackhat"
    );
     comboBox.setEditable(true); // this will let things to be editable
    comboBox.setPromptText("select a movie"); // yhis will be shown be defualt when selection
    comboBox.setOnAction(e->printMovie());

        var layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(comboBox,button);


        windows.setScene(new Scene(layout,300,300));



   // making a greedpane


    //button

     //checkboxes

     windows.show();



    }
  private void printMovie(){
      System.out.println(comboBox.getValue());
  }

}



