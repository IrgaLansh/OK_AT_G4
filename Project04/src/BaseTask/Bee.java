package BaseTask;

public class Bee {

    String description;
    long weight;

    public Bee(String Description, long Weight){this.description =Description; this.weight =Weight;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public long getWeight() {return weight;}
    public void setWeight(long weight) {this.weight = weight;}

    public void printBeeDetails(){
        System.out.println("Im smaller weights than elk in "+500/weight +" times.");
    }
}
