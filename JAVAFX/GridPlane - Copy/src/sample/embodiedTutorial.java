package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class embodiedTutorial {
    public static HBox setTop(){
        var topmenu = new HBox();
        Button buttonA  = new Button("File");
        Button buttonB  = new Button("edit");
        Button buttonC  = new Button("view");

        topmenu.getChildren().addAll(buttonA,buttonB,buttonC);

     return topmenu;

    }

    public static VBox setLeftMenu() {
        var leftMenu = new VBox();
        Button buttonD  = new Button("D");
        Button buttonE  = new Button("E");
        Button buttonF  = new Button("F");
        leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);
        return leftMenu;
    }
}
