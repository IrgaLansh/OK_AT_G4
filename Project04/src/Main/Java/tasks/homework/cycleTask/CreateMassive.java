package tasks.homework.cycleTask;

import java.util.Arrays;
import java.util.Random;

public class CreateMassive {

    public void creatingMassiv() {


        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("CreateMassive");
        System.out.print("CreateRndMassiv ");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(20);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        System.out.print("Reversed Massiv ");
        for (int i = massiv.length - 1; i >= 0; i--) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        System.out.print("*5 Massiv ");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] * 5 + " ");
        }
        System.out.println();

        System.out.print("SquaredMassiv ");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] * massiv[i] + " ");
        }
        System.out.println();

        int min_mass = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < min_mass) min_mass = massiv[i];
        }
        System.out.println("Min element " + min_mass);

        int first = massiv[0];
        massiv[0] = massiv[6];
        massiv[6] = first;
        String mixedMassiv = Arrays.toString(massiv);
        System.out.println("MixedMassiv " + mixedMassiv);

        for (int i = massiv.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    int tmp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = tmp;
                }
            }
        }
        String sortedMassiv = Arrays.toString(massiv);
        System.out.println("SortedMassiv " + sortedMassiv);
    }
}


