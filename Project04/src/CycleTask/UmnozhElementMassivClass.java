package CycleTask;

import java.util.Random;

public class UmnozhElementMassivClass {

    public void myUmnozhElementMassivClass(){

        int[] massiv = new int[7];
        Random random = new Random();

        System.out.println("UmnozhElementMassivClass");
        for (int i = 0; i < massiv.length; i++) {massiv[i] = random.nextInt(20);}
        for (int i = 0; i < massiv.length; i++) {System.out.print(massiv[i]*5 + " ");}
        System.out.println();
    }
}
