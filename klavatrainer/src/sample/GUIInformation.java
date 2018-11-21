package sample;

public class GUIInformation
{

    private String backgroundColor;
    private String buttonBackgroundColor;
    private String fontColor;
    private String fontSize;

    public GUIInformation()
    {
        this.backgroundColor = "-fx-background-color: green;";
        this.buttonBackgroundColor = "-fx-background-color: linear-gradient(#f0ff35, #a9ff00), radial-gradient(center 50% -40%, radius 200%, #b8ee36 45%, #80c800 50%);";
        this.fontColor = "-fx-text-fill: #green;";
        this.fontSize = "36";
    }

    public String getBackgroundColor()
    {
        return this.backgroundColor;
    }

    public String getButtonBackgroundColor()
    {
        return this.buttonBackgroundColor;
    }

    public String getFontColor()
    {
        return this.fontColor;
    }

    public String getFontSize()
    {
        return this.fontSize;
    }
}
