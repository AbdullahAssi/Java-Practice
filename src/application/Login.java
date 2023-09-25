package application;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Login {

    @FXML
    private Label nameLabel;

    public void displayName(String username) {
        nameLabel.setText("Welcome: " + username);
    }
}
