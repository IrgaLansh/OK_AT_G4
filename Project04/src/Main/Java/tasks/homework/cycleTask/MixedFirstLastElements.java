package tasks.homework.cycleTask;

import java.util.Arrays;
import java.util.Random;

public class MixedFirstLastElements {

    public void mixingFirstLastElements() {

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("MixedFirstLastElements");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(20);
        }
        int first = massiv[0];
        massiv[0] = massiv[6];
        massiv[6] = first;
        String mixedMassiv = Arrays.toString(massiv);
        System.out.println("mixedMassiv " + mixedMassiv);
    }
}
