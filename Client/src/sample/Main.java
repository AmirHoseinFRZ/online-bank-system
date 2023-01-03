package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;

public class Main extends Application {
    private static Stage stage;
    static Socket socket;
    static InputStream inputStream;
    static OutputStream outputStream;
    static DataInputStream in;
    static DataOutputStream out;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("signUpOrIn.fxml"));
        socket = new Socket("localhost", 123);
        inputStream = socket.getInputStream();
        outputStream = socket.getOutputStream();
        in = new DataInputStream(inputStream);
        out = new DataOutputStream(outputStream);
        primaryStage.setScene(new Scene(root, 500, 600));
        primaryStage.show();
    }

    public void changeScene(String fxml) throws Exception {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stage.getScene().setRoot(pane);
        //stage.wait(5000);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
