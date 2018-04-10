package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WelcomeController implements Initializable {
    public TextField textFieldLogin;

    public void enterTheGame_onAction(ActionEvent actionEvent) {
        Main.login = textFieldLogin.getText();
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(getClass().getClassLoader().getResource("fxml/Commander.fxml"));
            loader.load();
            Parent parent = loader.getRoot();
            Stage primaryStage = new Stage();
            Main.setMainStage(primaryStage);
            primaryStage.setTitle("Listen To Your Captain - ver. Client no. 1");
            primaryStage.setMinWidth(600);
            primaryStage.setMinHeight(900);
            primaryStage.setScene(new Scene(parent, 1600, 900));
            Stage stage = (Stage) textFieldLogin.getScene().getWindow();
            stage.hide();
            primaryStage.show();
        } catch (IOException ioEcx) {
            Logger.getLogger(CommanderController.class.getName()).log(Level.SEVERE, null, ioEcx);
        }
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
