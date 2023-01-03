package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Transmission {
    @FXML
    Button search;
    @FXML
    Button transmit;
    @FXML
    Label ba;
    @FXML
    Label an;
    @FXML
    Label al;
    @FXML
    Label balanceAfter;
    @FXML
    Label number;
    @FXML
    Label alias;
    @FXML
    Label label;
    @FXML
    TextField destination;
    @FXML
    TextField amount;

    static String destinations, amounts;

    public void search(ActionEvent actionEvent) throws IOException {
        destinations = destination.getText().toString();
        amounts = amount.getText().toString();

        Main.out.writeUTF("search");

        Main.out.writeUTF(destinations);
        Main.out.writeUTF(amounts);

        if (destinations.equals(""))
            label.setText("Empty field!");
        else if (amounts.equals(""))
            label.setText("Empty field!");
        else if(!(Main.in.readBoolean()))
            label.setText("Invalid destination number!");
        else {
            an.setText("account's username:");
            al.setText("alias:");
            alias.setText(Main.in.readUTF());
            number.setText(Main.in.readUTF());
            transmit.setVisible(true);
        }
    }
    public void transmit(ActionEvent actionEvent) throws Exception {
        Main.out.writeUTF("transmit");
        if(!(Main.in.readBoolean()))
        {
            label.setText("Insufficient balance!");
            transmit.setVisible(false);
            number.setText("");
            alias.setText("");
            al.setText("");
            an.setText("");
        }
        else
        {
            Main main = new Main();
            main.changeScene("enter.fxml");
        }
    }
}
