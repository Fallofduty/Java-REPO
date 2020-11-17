package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
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

  var person = new Person();
  person.first_nameProperty().addListener((v,oldValue,newValue)->{
      System.out.println("name changed to "+ newValue);
      System.out.println("firstnameProperty(): "+person.first_nameProperty());
      System.out.println("getForstName(): "+person.getFirst_name());

  });
  var button = new Button("submit")



   var grid = new GridPane();
   grid.setPadding(new Insets(10,10,10,20));
   grid.setVgap(8);
   grid.setHgap(10);
   grid.getChildren().addAll(nameLabel,passwordLabel,nameInput,passwordInput);

      var scence = new Scene(grid,300,200);
      scence.getStylesheets().add("sample/Viper.css");
      windows.setScene(scence);





     windows.show();



    }




}


