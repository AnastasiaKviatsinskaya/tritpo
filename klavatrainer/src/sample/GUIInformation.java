package sample;

public class GUIInformation
{

    private static String backgroundColor;
    private static String buttonBackgroundColor;
    private static String fontColor;
    private static String fontSize;

    private final String greenBackgroundColor = "-fx-background-color: green;";
    private final String greenButtonBackgroundColor = "-fx-background-color: darkgreen;";
    private final String greenFontColor = "-fx-text-fill: springgreen;";

    private final String blueBackgroundColor = "-fx-background-color: blue;";
    private final String blueButtonBackgroundColor = "-fx-background-color: darkblue;";
    private final String blueFontColor = "-fx-text-fill: deepskyblue;";



    public GUIInformation()
    {
        this.backgroundColor = greenBackgroundColor;
        this.buttonBackgroundColor = greenButtonBackgroundColor;
        this.fontColor = greenFontColor;
        this.fontSize = "36";
    }

    public String getBackgroundColor()
    {
        return this.backgroundColor;
    }

    public void setBackgroundColor(String color)
    {
        if(color.equalsIgnoreCase("green"))
        {
            this.backgroundColor = greenBackgroundColor;
        }

        if(color.equalsIgnoreCase("blue"))
        {
            this.backgroundColor = blueBackgroundColor;
        }
    }

    public String getButtonBackgroundColor()
    {
        return this.buttonBackgroundColor;
    }

    public void setButtonBackgroundColor(String color)
    {
        if(color.equalsIgnoreCase("green"))
        {
            this.buttonBackgroundColor = greenButtonBackgroundColor;
        }

        if(color.equalsIgnoreCase("blue"))
        {
            this.buttonBackgroundColor = blueButtonBackgroundColor;
        }
    }

    public String getFontColor()
    {
        return this.fontColor;
    }

    public void setFontColor(String color)
    {
        if(color.equalsIgnoreCase("green"))
        {
            this.fontColor = greenFontColor;
        }

        if(color.equalsIgnoreCase("blue"))
        {
            this.fontColor = blueFontColor;
        }
    }

    public String getFontSize()
    {
        return this.fontSize;
    }

    public void setFontSize(String size)
    {
        this.fontSize = size;
    }
}
