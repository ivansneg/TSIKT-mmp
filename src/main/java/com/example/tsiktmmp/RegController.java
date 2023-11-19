package com.example.tsiktmmp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegController {
    @FXML
    private Label welcomeText;


    @FXML
    private TextField usrnmField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField1;
    @FXML
    private Label sLabel;
    @FXML
    private PasswordField passwordField2;
    @FXML
    private Button sButton;

    @FXML

    protected void onHelloButtonClick() {

        //welcomeText.setText("Noice!You signed in)");
        final String SERVER_IP = "localhost";
        final int SERVER_PORT = 12345;


        // Create an instance of the Client class
        Client client = new Client(SERVER_IP, SERVER_PORT);


        // Call the startClient method to initiate the client logic
        if (passwordField1.getText().equals(passwordField2.getText())) {
            if (client.startClient("register",usrnmField.getText(), passwordField1.getText(), emailField.getText())) {
                loadMainScene();
                System.out.println("everything is okay");
            } else
                welcomeText.setText("Login or password is incorrect!");
        } else
            welcomeText.setText("Something went wrong");


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
    private void loadMainScene() {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainScene.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = (Stage) sButton.getScene().getWindow();
            stage.setScene(scene);

            MainSceneController mainSceneController = loader.getController();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}