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
TableView<Product> productTable = new TableView<>();
TextField nameInput,priceInput, quantityInput;






    public static void main(String[] args) {
          launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
    windows = primaryStage;

     windows = primaryStage;
     windows.setTitle("this is a test");
     var  button = new Button("Click me");


     //adding new items
        nameInput = new TextField();
        nameInput.setPromptText("name");
        nameInput.setMinWidth(100);

        priceInput= new TextField();
        priceInput.setPromptText("price");
        priceInput.setMinWidth(100);

        quantityInput = new TextField();
        quantityInput.setPromptText("quantity");
        quantityInput.setMinWidth(100);








        //setting up name column
        TableColumn<Product,String> nameColumn = new TableColumn<>("Name");
    /*
    tableCOlumn is needed to create table column
    // first put what kind of data will be stored here
    //TableColumn<Product,String>  this table will be storing product data
    it also has String for this column
     */

        // setting up pricce column
        TableColumn<Product,Double> priceColumn = new TableColumn<>("Price");
        // once again product column is there with DOuble as price has double
        TableColumn<Product,Integer> quantityCOlumn = new TableColumn<>("Quantity");

//setting up width

        nameColumn.setMinWidth(100);
        priceColumn.setMinWidth(200);
        quantityCOlumn.setMinWidth(300);

        //spassing values
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name")); // name is the same name as name from product its case sensitive so becareful
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price")); // price is the same thing also
        quantityCOlumn.setCellValueFactory(new PropertyValueFactory<>("quantity")); //




     //putting items on tables
        productTable.setItems(getProduct());
        //get all the product all product add them to lis t
        productTable.getColumns().addAll(nameColumn,priceColumn,quantityCOlumn);


        //button
        var addButton = new Button("add");
        addButton.setOnAction(e->addButtonClicked());
        var deleteBUtton = new Button("delete");
        deleteBUtton.setOnAction(e->deleteBUttonClicked());

        //making hbox for values
        var hbox = new HBox();
        hbox.setPadding((new Insets(10,10,10,10)));
        // same as html box top bottom left and right
        hbox.setSpacing(10);
       hbox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteBUtton);



        var layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
         layout.getChildren().addAll(productTable,hbox);


        windows.setScene(new Scene(layout,500,500));



   // making a greedpane


    //button

     //checkboxes

     windows.show();



    }
public ObservableList<Product> getProduct(){
        //this is a observable list of product with
    ObservableList<Product>products = FXCollections.observableArrayList(); // this will let use arraylist just like nor111111111111111111111111111111111111111111
    products.add(new Product()); // this is a default product
    products.add(new Product("ps4",399.99,20));
    products.add(new Product("ps4 pro",499.99,20));
    products.add(new Product("Xbox1",299.99,19));
    products.add(new Product("Xbox one x",599.99,10));
    products.add(new Product("ps4",399.99,20));
    return products;
}
public void addButtonClicked(){
        var product = new Product();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        // be default price is string
       // so have to be converted
       product.setQuantity(Integer.parseInt(quantityInput.getText()));
       productTable.getItems().add(product);
}

public void deleteBUttonClicked(){
        ObservableList<Product>productSelected,allProducts;
        // make two obserable list

        allProducts = productTable.getItems(); // get all the product items
        productSelected = productTable.getSelectionModel().getSelectedItems(); // find the selected model
        productSelected.forEach(allProducts::remove); // this deletes it

}


}


