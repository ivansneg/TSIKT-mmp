package com.example.tsiktmmp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddBookController {

    @FXML
    private TextField bookName;
    @FXML
    private TextField bookAuthor;

    public void addBookInstance(){
        final String SERVER_IP = "localhost";
        final int SERVER_PORT = 12345;

        Client client = new Client(SERVER_IP, SERVER_PORT);

        if (client.bookAdding(bookName.getText(),bookAuthor.getText())){
            System.out.println("Book added");
        } else {

        }
            //welcomeText.setText("Login or password is incorrect!");
    }
}
