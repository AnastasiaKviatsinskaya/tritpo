package sample;

public class TrainingInformation {
    private int currentLevel;
    private String reference;
    private String text;
    private String typeOfTraining;

    public TrainingInformation()
    {
        this.currentLevel = 0;
        this.typeOfTraining = "learning";
    }

    public void setTypeOfTraining(String typeOfTraining) {
        this.typeOfTraining = typeOfTraining;
    }

    public String getTypeOfTraining()
    {
        return this.typeOfTraining;
    }
}
