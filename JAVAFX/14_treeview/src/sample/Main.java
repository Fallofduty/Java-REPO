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
TreeView<String>treeView = new TreeView<>(); // setting up treeview  //main root


    public static void main(String[] args) {
          launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
    windows = primaryStage;

     windows = primaryStage;
     windows.setTitle("this is a test");
     var  button = new Button("Click me");

      TreeItem<String> root,nafis,batman; // naming treebranch aka childern

      root = new TreeItem<>();
      root.setExpanded(true); // expanded means everything collapsed so everything shos everything

      nafis = makeBranch("Nafis",root); // making nafis a child of root instationtion
        makeBranch("the ps4",nafis); //adding childern
        makeBranch("beef",nafis); // adding childern

        batman = makeBranch("batman",root); // making nafis a child of root instationtion
        makeBranch("fighting crime",batman); // adding childern
        makeBranch("justice league",batman); //adding childern

        //create tree
        treeView = new TreeView<>(root); // root is the parent directory for eveyrthing
        treeView.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue)->{
            if(newValue!=null){
                System.out.println(newValue.getValue());
            }
        });




        var layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(treeView,button);


        windows.setScene(new Scene(layout,300,300));



   // making a greedpane


    //button

     //checkboxes

     windows.show();



    }
    //create brranches
    public TreeItem<String> makeBranch(String title,TreeItem<String>parent){
        TreeItem<String> item = new TreeItem<>(title); // this will make it a tree item
        item.setExpanded(true); // will show all the items.
        parent.getChildren().add(item);
        return item;// this will return the branch
    }


}



