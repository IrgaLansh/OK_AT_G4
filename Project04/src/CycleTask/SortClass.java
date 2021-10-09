package CycleTask;

import java.util.Arrays;
import java.util.Random;

public class SortClass {

    public void mySortClass() {

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("SortClass");
        for (int i = 0; i < massiv.length; i++) {massiv[i] = random.nextInt(20);}
        for (int i = massiv.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    int tmp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = tmp;}}}
        String sortedMassiv = Arrays.toString(massiv);
        System.out.println("sortedMassiv " + sortedMassiv);
    }
}
