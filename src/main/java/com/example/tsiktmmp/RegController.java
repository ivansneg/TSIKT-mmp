package com.example.tsiktmmp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
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
    private PasswordField passwordField2;
    @FXML
    private Button sButton;

    @FXML

    protected void onHelloButtonClick() {
        welcomeText.setText("Noice!You signed in)");
    }
}