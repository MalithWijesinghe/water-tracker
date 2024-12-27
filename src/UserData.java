import java.io.Serializable;

public class UserData implements Serializable {
    private String userName;
    private double weight;
    private int recommendedIntake;
    private int customIntake;
    private int currentIntake;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return this.weight;
    }

    public void setRecommendedIntake(int recommendedIntake) {
        this.recommendedIntake = recommendedIntake;
    }
    public int getRecommendedIntake() {
        return this.recommendedIntake;
    }

    public void setCustomIntake(int customIntake) {
        this.customIntake = customIntake;
    }
    public int getCustomIntake() {
        return this.customIntake;
    }

    public void setCurrentIntake(int currentIntake) {
        this.currentIntake += currentIntake;
    }
    public int getCurrentIntake() {
        return this.currentIntake;
    }
}
