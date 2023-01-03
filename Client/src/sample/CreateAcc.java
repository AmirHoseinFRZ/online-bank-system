package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class CreateAcc implements Initializable {
    @FXML
    ChoiceBox kind;
    @FXML
    PasswordField password;
    @FXML
    PasswordField confirmPassword;
    @FXML
    TextField alias;
    @FXML
    Button continueButton;
    @FXML
    Label label;

    static String kinds, passwords, confirmPasswords, aliass;

    MouseEvent mouseEvent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        kind.getItems().add("Current");
        kind.getItems().add("Flat");
        kind.getItems().add("short saving");
        kind.getItems().add("long saving");
    }

    public void continueButton(ActionEvent actionEvent) throws Exception {

        kinds = kind.getValue().toString();
        aliass = alias.getText().toString();
        passwords = password.getText().toString();
        confirmPasswords = confirmPassword.getText().toString();

        if (kinds.equals(""))
            label.setText("Empty field!");
        else if (aliass.equals(""))
            label.setText("Empty field!");
        else if (passwords.equals(""))
            label.setText("Empty field!");
        else if (confirmPasswords.equals(""))
            label.setText("Empty field!");
        else if (!(passwords.equals(confirmPasswords)))
            label.setText("Please make sure the password and confirmation are the same!");

        else {
            Main main = new Main();
            main.changeScene("enter.fxml");
            Main.out.writeUTF(kinds);
            Main.out.writeUTF(passwords);
            Main.out.writeUTF(aliass);
            Main.out.writeUTF("enter");
        }

    }
}
