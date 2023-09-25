package application;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javafx.scene.shape.Circle;
import javafx.stage.Stage;




public class Controller{
	
	@FXML
	private Circle mycircle;
	private double x;
	private double y;
	@FXML
	TextField nameTextField; 
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private Button logoutButton;
	@FXML AnchorPane sectionPane;

	@FXML
	private CheckBox myCheckButton;	
	@FXML 
	private Label myLabel;
	@FXML
	private ImageView myImageView;
	
	@FXML 
	private ImageView Myimg;
	@FXML 
	
	private RadioButton button1,button2,button3;
	
	@FXML
    private Label nameLabel;


	Image myImage1 = new Image(getClass().getResourceAsStream("bulb1.png")); 
	Image myImage2 = new Image(getClass().getResourceAsStream("bulb2.png")); 
	Image myImage3 = new Image(getClass().getResourceAsStream("pizza.png"));
	Image myImage5 = new Image(getClass().getResourceAsStream("energy-drink.png"));
	Image myImage4 = new Image(getClass().getResourceAsStream("hamburger.png"));
	
	
	public void getFood (ActionEvent event) {
		if(button1.isSelected()) {
			Myimg.setImage(myImage3);
		}
		else if(button2.isSelected()){
			Myimg.setImage(myImage4);
		}
		else if(button3.isSelected()){
			Myimg.setImage(myImage5);
		}
	}
	
	public void change (ActionEvent event) {
		if(myCheckButton.isSelected()) {
			System.out.println("ON");
			myLabel.setText("ON");
			myImageView.setImage(myImage1);
		}
		else {
			System.out.println("OFF");
			myLabel.setText("OFF");
			myImageView.setImage(myImage2);
		}
	}
	public void logout(ActionEvent event) {
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("Your are About to Leave");
		alert.setContentText("Do You want to Save Before Exiting");
		
		if(alert.showAndWait().get() == ButtonType.OK) {			
			stage = (Stage) sectionPane.getScene().getWindow();
			System.out.println("Logged out");
			stage.close();
		}
	}
	
	public void Login(ActionEvent event) throws IOException {
		String username = nameTextField.getText();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Test.fxml"));
		root = loader.load();
		
		Controller loginC = loader.getController();
		loginC.displayName(username);
		System.out.println("Logged In as" + username);
	}


    public void displayName(String username) {
        nameLabel.setText("Welcome: " + username);
    }
	public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Test.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchToScene2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void switchToScene3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Bulb.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchToScene4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Food.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchToScene5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Temp.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchToScene6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}
	public void switchToScene7(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MusicPlayer.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}
	 
	
	public void up(ActionEvent e) {
		mycircle.setCenterY(y-=10);
		System.out.println("UP");
	}
	public void down(ActionEvent e) {
		mycircle.setCenterY(y+=10);
		System.out.println("Down");
	}
	public void left(ActionEvent e) {
		mycircle.setCenterX(x-=10);
		System.out.println("Left");
	}
	public void right(ActionEvent e) {
		mycircle.setCenterX(x+=10);
		System.out.println("Right");
	}




}

