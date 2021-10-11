package BaseTask;

public class TrainMethodsObjects {

    Mouse processMouse = new Mouse("Pipi", 6);
    Souce processSouce = new Souce("Pikachu","green");
    Bee processBee = new Bee("femail",2);
    Obstacle processObstacle = new Obstacle("tree","big");
    Pineapple processPineapple=new Pineapple("sweet", (float) 152.21);


    public void processMouse(Mouse mouse){
        System.out.println(mouse.getName() + " " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce){
        System.out.println(souce.getName() + " " + souce.getColor());
        souce.printSouceDetails();
    }

    public void processBee(Bee bee){
        System.out.println(bee.getGender() + " " + bee.getGender());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle){
        System.out.println(obstacle.getDescription() + " " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple){
        System.out.println(pineapple.getGrade() + " " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}
