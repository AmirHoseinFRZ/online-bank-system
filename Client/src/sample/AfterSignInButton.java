package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class AfterSignInButton {
    @FXML
    PasswordField password;
    @FXML
    TextField national;
    @FXML
    Button continueButton;
    @FXML
    Label label;

    static String nationals, passwords;

    public void password(ActionEvent actionEvent) { this.password = password; }

    public void national(ActionEvent actionEvent) {
        this.national = national;
    }

    public void continueButton(ActionEvent actionEvent) throws Exception
    {
        Main.out.writeUTF("continue");
        nationals = national.getText().toString();
        passwords = password.getText().toString();
        Main.out.writeUTF(nationals);
        Main.out.writeUTF(passwords);
        if (Main.in.readBoolean()) {
            Main main = new Main();
            main.changeScene("logIn.fxml");
        }
        else if (nationals.equals("") || passwords.equals(""))
            label.setText("Empty field!");
        else
            label.setText("Please make sure the username and password are correct!");
        }
    }

