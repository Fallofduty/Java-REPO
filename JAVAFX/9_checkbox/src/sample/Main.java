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


   // making a greedpane


    //button

     //checkboxes
     var Checkbox1 = new CheckBox("Bacon");
     var checkBOx2 = new CheckBox("Cheicken");
     checkBOx2.setSelected(true); // this means chicken will be selected by default.
     var button = new Button("Order Now");
     button.setOnAction(e->handleoptions(Checkbox1,checkBOx2));

     var layout = new VBox(10);
     layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(Checkbox1,checkBOx2,button);

        windows.setScene(new Scene(layout,300,300));
     windows.show();



    }
private void handleoptions(CheckBox box1,CheckBox box2){
        String message = "";
        if(box1.isSelected()){
            message = box1.getText();
        }else if(box2.isSelected()){
            message = box2.getText();
        }else {
            System.out.println("nothing is selected");
        }
    System.out.println(message);

}


}
