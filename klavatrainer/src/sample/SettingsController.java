package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class SettingsController {

    @FXML
    Button saveButton, menuButton, backgroundDownloadButton;

    @FXML
    ComboBox fontColoreChoice, fontSizeChoice, backgroundColorChoice, trainingChoice;

    @FXML
    RadioButton showKeyboard, hintKeyboard;

    private Metod metod;

    @FXML
    public void initialize()
    {
        metod = new Metod();
        saveButton.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        menuButton.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        backgroundDownloadButton.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        backgroundColorChoice.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        fontColoreChoice.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        fontSizeChoice.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        trainingChoice.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        trainingChoice.setStyle("-fx-te");
        fontSizeChoice.getItems().setAll("36");
        fontSizeChoice.getSelectionModel().selectFirst();
        fontColoreChoice.getItems().setAll("green", "black");
        fontColoreChoice.getSelectionModel().selectFirst();
        backgroundColorChoice.getItems().setAll("green");
        backgroundColorChoice.getSelectionModel().selectFirst();
        trainingChoice.getItems().setAll("learning", "speed");
        trainingChoice.getSelectionModel().selectFirst();
    }

    public void downloadImage()
    {

    }

    public void showMenu()
    {
        Stage stage = (Stage) menuButton.getScene().getWindow();
        Metod.closeWindows(stage);
        Metod.showWindows("menu.fxml");
    }

    public void saveSettings()
    {

    }

}
