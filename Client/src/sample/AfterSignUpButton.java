package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AfterSignUpButton {
    @FXML
    TextField username;
    @FXML
    TextField email;
    @FXML
    PasswordField password;
    @FXML
    PasswordField confirmPassword;
    @FXML
    Button continueButton;
    @FXML
    Label label;
    @FXML
    TextField national;
    @FXML
    TextField telephone;

    static String passwords, confirmPasswords, emails, usernames, nationals, telephones;

    public void password(ActionEvent actionEvent) {
        this.password = password;
    }

    public void confirmPassword(ActionEvent actionEvent) {
        this.confirmPassword = confirmPassword;
    }

    public void email(ActionEvent actionEvent) { this.email = email; }

    public void username(ActionEvent actionEvent) {
        this.username = username;
    }

    public void national(ActionEvent actionEvent) { this.national = national; }

    public void telephone(ActionEvent actionEvent) { this.telephone = telephone; }

    public void continueButton(ActionEvent actionEvent) throws Exception {
        emails = email.getText().toString();
        nationals = national.getText().toString();
        usernames = username.getText().toString();
        passwords = password.getText().toString();
        telephones = telephone.getText().toString();
        confirmPasswords = confirmPassword.getText().toString();
        if (usernames.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else if (emails.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else if (passwords.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else if (confirmPasswords.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else if (nationals.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else if (telephones.equals(""))
        {
            label.setText("Empty field!");
            Main.out.writeBoolean(false);
        }
        else if (!(password.getText().toString().equals(confirmPassword.getText().toString())))
        {
            label.setText("Please make sure the password and confirmation are the same!");
            Main.out.writeBoolean(false);
        }
        else {
            Main.out.writeBoolean(true);
            Main main = new Main();
            main.changeScene("createAcc.fxml");
            Main.out.writeUTF(usernames);
            Main.out.writeUTF(nationals);
            Main.out.writeUTF(telephones);
            Main.out.writeUTF(emails);
            Main.out.writeUTF(passwords);
            Main.out.writeUTF("createAccount");
        }

    }
}
