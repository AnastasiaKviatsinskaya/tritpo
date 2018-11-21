package sample;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author kam123ua
 */
public class Metod {

    private static GUIInformation guiInformation;
    private static TrainingInformation trainingInformation;

    public Metod()
    {
        guiInformation = new GUIInformation();
        trainingInformation = new TrainingInformation();
    }

    public static void showWindows(String str){
        Stage primaryStage = new Stage();
        Pane mainPane;

        try {
            /*Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
            primaryStage.setTitle("Trainer");
            primaryStage.setScene(new Scene(root, 938, 651));
            primaryStage.show();
            */
            mainPane = FXMLLoader.load(Main.class.getResource(str));
            mainPane.setStyle(guiInformation.getBackgroundColor());
            mainPane.setStyle(guiInformation.getFontColor());
            primaryStage.setScene(new Scene(mainPane));
            primaryStage.setTitle("Trainer");
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeWindows(Stage stage) {
        stage.close();
    }

    public static GUIInformation getGuiInformation()
    {
        return guiInformation;
    }



}