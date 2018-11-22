package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingsController {

    @FXML
    Button saveButton, menuButton, backgroundDownloadButton;

    @FXML
    ComboBox fontColoreChoice, fontSizeChoice, backgroundColorChoice, trainingChoice;

    @FXML
    RadioButton showKeyboard, hintKeyboard;

    @FXML
    public void initialize()
    {

        saveButton.setStyle((Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor()));
        menuButton.setStyle((Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor()));
        backgroundDownloadButton.setStyle((Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor()));
        backgroundColorChoice.setStyle((Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor()));
        fontColoreChoice.setStyle((Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor()));
        fontSizeChoice.setStyle((Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor()));
        trainingChoice.setStyle((Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor()));
        fontSizeChoice.getItems().setAll("36");
        fontSizeChoice.getSelectionModel().selectFirst();
        fontColoreChoice.getItems().setAll("green", "blue");
        fontColoreChoice.getSelectionModel().selectFirst();
        backgroundColorChoice.getItems().setAll("green", "blue");
        backgroundColorChoice.getSelectionModel().selectFirst();
        trainingChoice.getItems().setAll("learning", "speed");
        trainingChoice.getSelectionModel().selectFirst();
    }

    public void downloadImage()
    {

    }

    public void showMenu() throws IOException {
        Stage stage = (Stage) menuButton.getScene().getWindow();
        Metod.closeWindows(stage);
        Metod.showWindows("menu.fxml");
    }

    public void saveSettings() throws IOException {
        Metod.getGuiInformation().setBackgroundColor(backgroundColorChoice.getValue().toString());
        Metod.getGuiInformation().setButtonBackgroundColor(backgroundColorChoice.getValue().toString());
        Metod.getGuiInformation().setFontColor(fontColoreChoice.getValue().toString());
        Stage stage = (Stage) menuButton.getScene().getWindow();
        Metod.closeWindows(stage);
        Metod.showWindows("settings.fxml");
    }

}
