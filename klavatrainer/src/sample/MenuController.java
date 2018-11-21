package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    Button startButton, exitButton, settingButton;

    private Metod metod;

    @FXML
    public void initialize()
    {
        metod = new Metod();
        startButton.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        exitButton.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
        settingButton.setStyle(metod.getGuiInformation().getButtonBackgroundColor());
    }

    public void showGame(ActionEvent event)
    {
        /*Stage stage = (Stage) startButton.getScene().getWindow();
        Metod.closeWindows(stage);
        Metod.showWindows("game.fxml");*/
    }

    public void showSetting(ActionEvent event)
    {
        Stage stage = (Stage) startButton.getScene().getWindow();
        Metod.closeWindows(stage);
        Metod.showWindows("settings.fxml");
    }

    public void exit(ActionEvent event)
    {
        Platform.exit();

    }
}
