package BaseTask;

public class Pineapple {

    String grade;
    float heatCapacity;

    public Pineapple(String Grade, float HeatCapacity){this.grade =Grade; this.heatCapacity =HeatCapacity;}

    public String getGrade() {return grade;}
    public void setGrade(String grade) {this.grade = grade;}
    public float getHeatCapacity() {return heatCapacity;}
    public void setHeatCapacity(float heatCapacity) {this.heatCapacity = heatCapacity;}

    public void printPineappleDetails(){
        if(heatCapacity >2140){System.out.println("Im Pineapple which warmer than meat");}
        else {System.out.println("Meat warmer than me :(");}
    }
}
