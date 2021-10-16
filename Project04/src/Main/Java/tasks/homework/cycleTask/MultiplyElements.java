package tasks.homework.cycleTask;

import java.util.Random;

public class MultiplyElements {

    public void multiplyingElementMassiv() {

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("Multiplied Elements");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(20);
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] * 5 + " ");
        }
        System.out.println();
    }
}
