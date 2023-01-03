package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SignUpOrIn {
    @FXML
    Button signUpButton;
    @FXML
    Button signInButton;

    public void signIn(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("afterSignInButton.fxml");
        Main.out.writeUTF("signIn");
    }

    public void signUp(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("afterSignUpButton.fxml");
        Main.out.writeUTF("signUp");
    }
}
