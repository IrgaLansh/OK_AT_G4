package tasks.homework.cycleTask;

import java.util.Random;

public class MinimalElementValue {

    public void gettingOfMinElement() {

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("MinElement of massive");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(20);
        }
        int ele_min = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < ele_min) ele_min = massiv[i];
        }
        System.out.println(ele_min);
    }
}
