package tasks.homework.cycleTask;

public class CycleFor {

    public void cyclingFor() {

        System.out.println("CycleFor");
        for (int i = 3; i < 20; i += 1) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
