package CycleTask;

import java.util.Random;

public class KvadratElementMassivClass {

    public void myKvadratElementMassivClass(){

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("KvadratElementMassivClass");
        for (int i = 0; i < massiv.length; i++) {massiv[i] = random.nextInt(20);}
        for (int i = 0; i < massiv.length; i++) {System.out.print(massiv[i]*massiv[i] + " ");}
        System.out.println();
    }
}
