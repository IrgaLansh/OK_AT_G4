package BaseTask;

public class Souce {

    String name;
    String color;

    public Souce(String Name, String Color){this.color =Color; this.name =Name;}

    public String getName() {return name;}
    public void setName(String name) { this.name = name;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public void printSouceDetails(){
        System.out.println("This souce " + name +" of "+ color +" color.");
    }
}
