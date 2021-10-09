package BaseTask;

public class Obstacle {

    String description;
    String severity;

    public Obstacle(String Description, String Severity){this.description =Description; this.severity =Severity;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getSeverity() {return severity;}
    public void setSeverity(String severity) {this.severity = severity;}

    public void printObstacleDetails(){
        System.out.println("There are " + severity +" issue is "+ description +".");
    }
}
