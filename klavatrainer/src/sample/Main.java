package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Metod metod;

    @Override
    public void start(Stage primaryStage) throws Exception{

        metod = new Metod();
        Metod.showWindows("menu.fxml");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
