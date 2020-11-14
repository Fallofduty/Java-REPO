package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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


   // making a greedpane
     var gridpane = new GridPane();
     gridpane.setPadding(new Insets(10,10,10,10)); // created 10 pixel padding around the windows.
     gridpane.setVgap(8); // vertical 8 gap
     gridpane.setHgap(10); // horizental is 10 gap

        //creating albel for name
     var nameLabel = new Label("username");
     GridPane.setConstraints(nameLabel,0,0); // postion at 0 and 0 cause array starts at 0

     //nameinput
        var input = new TextField("enter name"); // enter name 1,0 right beside it
        GridPane.setConstraints(input,1,0);

     var passwordLabel = new Label("enter password");
     GridPane.setConstraints(passwordLabel,0,1); // set at buttom of grid pane at password

     var enterPassword = new TextField();
     enterPassword.setPromptText("enter password hint start with pokemon"); // set at the textfield which as promt text
     GridPane.setConstraints(enterPassword,1,1);

        Button loginButton = new Button("login");
        GridPane.setConstraints(loginButton,1,2); // set at 1 and 2

     gridpane.getChildren().addAll(nameLabel,input,passwordLabel,enterPassword,loginButton); // adding to childern

windows.setScene(new Scene(gridpane,300,300)); // setting height and width

     windows.show();



    }
private void closeProgram(){
    boolean answer = confirmbox.display("title","are you sure you want to exist");
    if(answer){
        windows.close();
    }

}


}
