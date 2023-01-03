package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogIn {
    @FXML
    TextField alias;
    @FXML
    PasswordField password;
    @FXML
    Button continueButton;
    @FXML
    Label label;

    static String aliass, passwords;

    public void continueButton(ActionEvent actionEvent) throws Exception {
        Main.out.writeUTF("continue");
        aliass = alias.getText().toString();
        passwords = password.getText().toString();
        Main.out.writeUTF(aliass);
        Main.out.writeUTF(passwords);
        if (aliass.equals(""))
            label.setText("Empty field!");
        else if (passwords.equals(""))
            label.setText("Empty field!");
        else if (!(Main.in.readBoolean()))
        {
            label.setText("Please make sure the alias or the password are correct!");
        }
        else
        {
            Main main = new Main();
            main.changeScene("enter.fxml");
        }
    }
}
