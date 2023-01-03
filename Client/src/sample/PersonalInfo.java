package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class PersonalInfo {
    @FXML
    Label transaction1;
    @FXML
    Button button;
    @FXML
    Label name;
    @FXML
    Label national;
    @FXML
    Label email;
    @FXML
    Label accNo;
    @FXML
    Label telephone;
    @FXML
    Label alias;
    @FXML
    Label kind;
    @FXML
    Label b;
    @FXML
    Label balance;
    @FXML
    TextArea transaction;
    @FXML
    Button done;

    public void button() throws IOException {
        transaction.setEditable(false);
        int i = 0;
        while (i < 4)
        {
            if(i == 0)
                name.setText(Main.in.readUTF().toString());
            else if(i == 1)
                national.setText(Main.in.readUTF().toString());
            else if(i == 2)
                telephone.setText(Main.in.readUTF().toString());
            else if(i == 3)
                email.setText(Main.in.readUTF().toString());
            i++;
        }
        i = 0;
        while (i < 4)
        {
            if(i == 0)
                alias.setText(Main.in.readUTF().toString());
            else if(i == 1)
                accNo.setText(Main.in.readUTF().toString());
            else if(i == 2)
                kind.setText(Main.in.readUTF().toString());
            else if(i == 3)
                balance.setText(Main.in.readUTF().toString());
            i++;
        }
        transaction.setText(Main.in.readUTF());
        button.setDisable(true);
    }

    public void back(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("enter.fxml");
        Main.out.writeUTF("back");
    }
}