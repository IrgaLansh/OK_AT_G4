package tasks.homework.cycleTask;

import java.util.Random;

public class ReverseElements {

    public void reversingElements() {

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("Reversed Elements");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(20);
        }
        for (int i = massiv.length - 1; i >= 0; i--) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
    }
}
