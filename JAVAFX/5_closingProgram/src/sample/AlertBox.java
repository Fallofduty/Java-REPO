package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    public static void display(String title,String Message){
        var window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);// this will block any other windows from opening up
        //other stuff will be locked
        window.setTitle(title);
        window.setWidth(250);

        var label = new Label(Message);
        var closebutton = new Button("close the window");
        closebutton.setOnAction(e->window.close()); // this will close button

        var layout = new VBox(label,closebutton);
        layout.setAlignment(Pos.CENTER);
        window.setScene(new Scene(layout));
        window.showAndWait();

    }
}
