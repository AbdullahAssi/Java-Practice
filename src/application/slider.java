package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

public class slider implements Initializable {
    @FXML
    private Label tempLabel;
    @FXML
    private Slider mySlider;
    
	private Stage stage;
	private Scene scene;
	private Parent root;
	
    public void switchToScene5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Test.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	int temp = (int)mySlider.getValue();
        
        tempLabel.setText(temp + "°C");
        
        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                int temp = newValue.intValue();
                
                tempLabel.setText(temp + "°C");
            }
        });
    }
}
