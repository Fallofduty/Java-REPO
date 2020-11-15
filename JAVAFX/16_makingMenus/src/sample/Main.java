package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.nio.ByteOrder;


public class Main extends Application {
// this will show the screens
// windows will show the stages
// scence 1 and scence 2 will show the scences

 Stage windows;
 BorderPane layout; //layout is prefred for mney system

    public static void main(String[] args) {
          launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
    windows = primaryStage;

     windows = primaryStage;
     windows.setTitle("this is a test");

     Menu fileMenu = new Menu("File"); //fileMenu file is created

     //adding items to file meny
     // sso when file menu is clicked thesse items will show up under
     fileMenu.getItems().add(new MenuItem("new Project"));
     fileMenu.getItems().add(new MenuItem("open..."));
     fileMenu.getItems().add(new MenuItem("save..."));
     //ading seprator
     fileMenu.getItems().add(new SeparatorMenuItem());
     // this will create line between getitems
     fileMenu.getItems().add(new MenuItem("settings..."));
     fileMenu.getItems().add(new SeparatorMenuItem());
     var exists = new MenuItem("exists");
     exists.setDisable(true); // this will disable the items
     fileMenu.getItems().add(exists);


     var editMenu = new Menu("_edit");
     // by having the underline alt _e it will let me click on it.
     editMenu.getItems().add((new MenuItem("undo backspace")));
     editMenu.getItems().add((new MenuItem("redo")));
     editMenu.getItems().add(new SeparatorMenuItem());
     editMenu.getItems().add((new MenuItem("cut")));
     editMenu.getItems().add((new MenuItem("copy")));
     editMenu.getItems().add((new MenuItem("paste")));
     //ading clickable menu item

  //adiing checked version.
    var helpMenu = new Menu("Help");
    var showLines = new CheckMenuItem("show line numbers");
    showLines.setOnAction(e->{
        if(showLines.isSelected()){
            System.out.println("program will now display line numbers");
        }else {
            System.out.println("giding line numbers");
        }
    });
    showLines.setSelected(true); // will set clickcled by defaults
    helpMenu.getItems().add(showLines);

        var print = new MenuItem("Print....");
        print.setOnAction(e-> System.out.println("print button was clicked"));
     editMenu.getItems().add(print);

     // to add items choose fileMenu then get items and then add followed by new Menu item

     //add it to a fileMenu bar

       //radio meny item

     var difficiultMenu = new Menu("Difficulity");
     var toogleMenu = new ToggleGroup();

     var easy = new RadioMenuItem("EASY");
     var medium = new RadioMenuItem("Medium");
     var hard = new RadioMenuItem("Hard");

     //setting toogle groip
    easy.setToggleGroup(toogleMenu);
    medium.setToggleGroup(toogleMenu);
    hard.setToggleGroup(toogleMenu);

    difficiultMenu.getItems().addAll(easy,medium,hard);

     var menuBar = new MenuBar();
     //menu bar is the paremnt
     menuBar.getMenus().add(fileMenu);
     menuBar.getMenus().add(editMenu);
     menuBar.getMenus().add(helpMenu);
     menuBar.getMenus().add(difficiultMenu);
     //adding file menu to getmenus.


    layout = new BorderPane();
    layout.setTop(menuBar);

    windows.setScene(new Scene(layout,400,400));



     windows.show();



    }




}


