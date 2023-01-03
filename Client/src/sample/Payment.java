package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class Payment {
    @FXML
    Label baf;
    @FXML
    Label balance;
    @FXML
    TextField bill;
    @FXML
    TextField amount;
    @FXML
    javafx.scene.control.Button continueButton;
    @FXML
    Button pay;

    public void pay(ActionEvent actionEvent) {
        continueButton.setVisible(true);
        balance.setText("Balance after payment:");
        //baf.setText("");
    }

    public void continueButton(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
    }
}
