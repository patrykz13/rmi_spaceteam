package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {
    private static Stage mainStage;
    public static String login;
    public static String commander;

    @Override
    public void start(Stage primaryStage) {


            FXMLLoader loader = new FXMLLoader();
            try {
                Main.mainStage = primaryStage;
                loader.setLocation(getClass().getClassLoader().getResource("fxml/welcome.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                mainStage.setTitle("Listen To Your Captain - ver. Client no. 1");
                mainStage.resizableProperty().setValue(Boolean.FALSE);
                mainStage.setScene(new Scene(root, 819, 325));
                mainStage.centerOnScreen();
                mainStage.show();
            } catch (IOException ioEcx) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ioEcx);
            }
    }

    @Override
    public void stop() {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getMainStage() {
        return mainStage;
    }

    public static void setMainStage(Stage mainStage) {
        Main.mainStage = mainStage;
    }

}
