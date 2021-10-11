package BaseTask;

public class Pineapple {

    private String grade;
    private float heatCapacity;

    public Pineapple(String grade, float heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(float heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails() {
        if (getHeatCapacity() > 2140) {
            System.out.println("Im Pineapple which warmer than meat");
        } else {
            System.out.println("Meat warmer than me :(");
        }
    }
}
