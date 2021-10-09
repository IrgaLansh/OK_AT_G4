package CycleTask;

import java.util.Arrays;
import java.util.Random;

public class MixFirstLastClass {

    public void myMixFirstLastClass() {

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("MixFirstLastClass");
        for (int i = 0; i < massiv.length; i++) {massiv[i] = random.nextInt(20);}
        int first = massiv[0];
        massiv[0] = massiv[6];
        massiv[6]=first;
        String mixedMassiv = Arrays.toString(massiv);
        System.out.println("mixedMassiv " + mixedMassiv);
    }
}
