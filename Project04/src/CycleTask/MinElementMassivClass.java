package CycleTask;

import java.util.Random;

public class MinElementMassivClass {

    public void myMinElementMassivClass() {

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("MinElementMassivClass");
        for (int i = 0; i < massiv.length; i++) {massiv[i] = random.nextInt(20);}
        int ele_min = massiv[0];
        for (int i = 0; i < massiv.length; i++) {if(massiv[i] < ele_min) ele_min = massiv[i];}
        System.out.println(ele_min);
    }
}
