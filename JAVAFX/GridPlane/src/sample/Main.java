package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
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


     //making hbox for values
        var hbox = new HBox();
        hbox.setPadding((new Insets(10,10,10,10)));
        // same as html box top bottom left and right
        hbox.setSpacing(10);
    //   hbox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteBUtton);



        var layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));


        windows.setScene(new Scene(layout,500,500));




     windows.show();



    }




}


