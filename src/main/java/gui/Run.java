package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import products.Product;
import products.ProductsExtent;

import static javafx.application.Application.launch;

public class Run extends Application {

    @Override
    public void start(Stage primaryStage) {
        new Product("Bar", 12.0, 1);
        new Product("Tea", 14.0, 5);
        new Product("Coffee", 13.0, 6);
        new Product("Chocolate", 12.0, 10);
        new Product("Cola", 54.0, 5);
        new Product("Snacks", 33.0, 6);

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
