package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
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


     //creating left and right
        var borderpane = new BorderPane();
        borderpane.setTop(embodiedTutorial.setTop()); // pased the conssctrur as a reference
        borderpane.setLeft(embodiedTutorial.setLeftMenu()); // pasedd mpde as referemce

     windows.setScene(new Scene(borderpane,300,250));
     windows.show();



    }
private void closeProgram(){
    boolean answer = confirmbox.display("title","are you sure you want to exist");
    if(answer){
        windows.close();
    }

}


}
