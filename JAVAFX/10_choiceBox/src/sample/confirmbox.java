package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class confirmbox {
    static boolean answer;
    public static boolean display(String title,String Message){
        var window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);// this will block any other windows from opening up

        //other stuff will be locked
        window.setTitle(title);
        window.setWidth(250);

          //create two buttons
        var yesBUtton = new Button("yes");
        var noButton = new Button("no");

        yesBUtton.setOnAction(event -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(event -> {
            answer = false;
            window.close();
        });

        var layout = new VBox(new Label(Message),noButton,yesBUtton);
        layout.setAlignment(Pos.CENTER);
        window.setScene(new Scene(layout));
        window.showAndWait();

        return answer; // will return true or false.

    }
}
