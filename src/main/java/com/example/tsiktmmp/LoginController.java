package com.example.tsiktmmp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Parent;
public class LoginController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label sLabel;
    @FXML
    private Button sButton;

    @FXML
    protected void onHelloButtonClick() {

        //welcomeText.setText("Noice!You signed in)");
        final String SERVER_IP = "localhost";
        final int SERVER_PORT = 12345;
        String decoyString = null;

        // Create an instance of the Client class
        Client client = new Client(SERVER_IP, SERVER_PORT);

        // Call the startClient method to initiate the client logic
        if (client.startClient(textField.getText(),passwordField.getText(),decoyString)){
           loadMainScene();
        } else
            welcomeText.setText("Login or password is incorrect!"):


    }

    @FXML
    private void switchOnClick(){
        loadScene();
    }

    private void loadScene() {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("reg.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = (Stage) sLabel.getScene().getWindow();
            stage.setScene(scene);

            RegController regController = loader.getController();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}