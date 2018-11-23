package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;
import java.util.Arrays;

public class LearningTrainingController {
    @FXML
    Button menuButton, referenceButton, startButton;

    @FXML
    ComboBox levelChoice;

    @FXML
    TextArea textArea;

    @FXML
    ImageView keyboardImage;

    @FXML
    public void initialize()
    {
        startButton.setStyle("-fx-text-fill: " + ScreenManager.getGuiInformation().getFontColor() +";");
        menuButton.setStyle("-fx-text-fill: " + ScreenManager.getGuiInformation().getFontColor() +";");
        referenceButton.setStyle("-fx-text-fill: " + ScreenManager.getGuiInformation().getFontColor() +";");
    }

    public void startTraining(ActionEvent event) throws IOException {
    }

    public void showMenu(ActionEvent event) throws IOException {
        Stage stage = (Stage) menuButton.getScene().getWindow();
        ScreenManager.closeWindows(stage);
        ScreenManager.showWindows("menu.fxml");
    }

    public void showReference(ActionEvent event) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("A:\\trirpolabs\\tritpo\\klavatrainer\\src\\reference.txt"), "UTF-8"));
        String currentLine;
        while((currentLine = bufferedReader.readLine()) != null)
        {
            textArea.appendText(currentLine);
        }

    }

}
