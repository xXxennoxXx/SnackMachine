package gui;

import core.Machine;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import payments.Payment;
import payments.PaymentType;
import products.Product;
import products.ProductsExtent;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private static String CHOICE_PROPERTY_NAME = "choice";

    @FXML
    private Button btnA;
    @FXML
    private ListView<Product> lvProduct;
    @FXML
    private RadioButton rbCash;
    @FXML
    private RadioButton rbCard;
    @FXML
    private ToggleGroup pay;
    @FXML
    private TextField tfInfo;
    @FXML
    private Label lblTotal;

    private Machine machine;
    ObservableList<Product> productObservableList;

    public void prodClick(MouseEvent mouseEvent) {
        lblTotal.setText(String.valueOf(lvProduct.getSelectionModel().getSelectedItem().getPrice()));

    }

    public void buy(ActionEvent actionEvent) {

        Product product = lvProduct.getSelectionModel().getSelectedItem();
        RadioButton radioButton = (RadioButton) pay.getSelectedToggle();
        PaymentType type = (PaymentType) radioButton.getProperties().get(CHOICE_PROPERTY_NAME);
        try {
            machine.evaluateRequest(type, product);
        } catch (Exception e) {
            tfInfo.setText(e.getMessage());
        }
        productObservableList.clear();
        productObservableList.addAll(ProductsExtent.getInstance().getProducts());


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rbCard.getProperties().put(CHOICE_PROPERTY_NAME, PaymentType.CARD);
        rbCash.getProperties().put(CHOICE_PROPERTY_NAME, PaymentType.CASH);

        machine = new Machine();

        List<Product> products = ProductsExtent.getInstance().getProducts();

        productObservableList = FXCollections.observableArrayList(products);
        lvProduct.setItems(productObservableList);

        lvProduct.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }


}
