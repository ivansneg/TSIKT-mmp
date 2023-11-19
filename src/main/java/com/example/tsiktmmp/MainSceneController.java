package com.example.tsiktmmp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {

    @FXML
    private GridPane gridPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                ImageView imageView = new ImageView(new Image("C:\\Users\\Paul\\IdeaProjects\\tsikt-mmp\\src\\main\\java\\com\\example\\tsiktmmp\\Images\\a.jpg"));
                imageView.setFitWidth(100);
                imageView.setFitHeight(100);
                Button button = new Button("Click Me");
                Text label = new Text("ImageView " + (row * 3 + col + 1));

                // Handle button click
                button.setOnAction(event -> {
                    label.setText("Button Clicked!");
                    // Add more actions if needed
                });

                // Add components to the GridPane
                gridPane.add(imageView, col, row);
                gridPane.add(button, col, row + 1);
                gridPane.add(label, col, row + 2);
            }
        }
    }
}