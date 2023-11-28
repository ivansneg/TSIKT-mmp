package com.example.tsiktmmp;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;
import javafx.event.ActionEvent;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {

    @FXML
    private GridPane gridPane;
    @FXML
    private MenuItem addBook;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        final String SERVER_IP = "localhost";
        final int SERVER_PORT = 12345;


        // Create an instance of the Client class
        Client client = new Client(SERVER_IP, SERVER_PORT);

        String[] books = client.bookLoading("bookload");
        int length = books.length;
        // Add ComboBoxes to the GridPane
        for (int row = 0; row < length  ; row++) {

                MenuButton menuButton;

                if (row < books.length) {
                    menuButton = new MenuButton(books[row]);
                    menuButton.setId(books[row]);
                } else {
                    // If there are not enough books, create an empty menu button
                    menuButton = new MenuButton("No Book");
                }


                MenuItem addItem = new MenuItem("Add");
                MenuItem deleteItem = new MenuItem("Delete");
                menuButton.getItems().addAll(
                        addItem ,
                        deleteItem
                );

                EventHandler<ActionEvent> menuItemHandler1 = event -> {
                    // Get the ID of the menu button
                    String menuButtonId = menuButton.getId();
                    client.bookBorrowing(menuButtonId);

                    // You can use the menuButtonId as needed
                };

                EventHandler<ActionEvent> menuItemHandler2 = event -> {
                    // Get the ID of the menu button
                    String menuButtonId = menuButton.getId();
                    client.bookBorrowing(menuButtonId);

                    // You can use the menuButtonId as needed
                };

                addItem.setOnAction(menuItemHandler1);

                gridPane.add(menuButton, 1, row);

        }

    }



    public void loadScene1(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("addbook.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            Stage stage = (Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow();
            stage.setScene(scene);

            AddBookController addBookController = loader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadScene2(ActionEvent event) {
        if(isAdmin()){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("requests.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);

                Stage stage = (Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow();
                stage.setScene(scene);

                RequestController requestController = loader.getController();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("You have no access to requests");
        }
        }

    private boolean isAdmin() {
        final String SERVER_IP = "localhost";
        final int SERVER_PORT = 12345;


        // Create an instance of the Client class
        Client client = new Client(SERVER_IP, SERVER_PORT);
        return client.isAdmin();

    }
}