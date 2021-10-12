package BaseTask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        new TrainMethodsObjects().processMouse(new Mouse("Pipi", 6));
        new TrainMethodsObjects().processSouce(new Souce("Pikachu", "green"));
        new TrainMethodsObjects().processBee(new Bee("femail", 2));
        new TrainMethodsObjects().processObstacle(new Obstacle("tree", "big"));
        new TrainMethodsObjects().processPineapple(new Pineapple("sweet", 4152.21F));
    }
}
