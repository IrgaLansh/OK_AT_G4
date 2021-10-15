package project.homework.BaseTask;

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
        System.out.println(getHeatCapacity() > 2140 ? "I am a pineapple with a higher heatCapacity than ham" :
                "More heat is stored in the ham :(");
    }
}

