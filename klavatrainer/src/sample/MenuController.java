package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    Button startButton, exitButton, settingButton;

    @FXML
    public void initialize()
    {
        startButton.setStyle(Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor());
        exitButton.setStyle(Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor());
        settingButton.setStyle(Metod.getGuiInformation().getFontColor() + Metod.getGuiInformation().getButtonBackgroundColor());
    }

    public void showGame(ActionEvent event)
    {
        /*Stage stage = (Stage) startButton.getScene().getWindow();
        Metod.closeWindows(stage);
        Metod.showWindows("game.fxml");*/
    }

    public void showSetting(ActionEvent event) throws IOException {
        Stage stage = (Stage) startButton.getScene().getWindow();
        Metod.closeWindows(stage);
        Metod.showWindows("settings.fxml");
    }

    public void exit(ActionEvent event)
    {
        Platform.exit();
    }
}
