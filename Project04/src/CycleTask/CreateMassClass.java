package CycleTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CreateMassClass {

    public void myCreateMassClass() {
        int[] massiv = new int[7];
        Random random = new Random();
//растянуть по классам

        for (int i = 0; i < massiv.length; i++) {massiv[i] = random.nextInt(10);
            System.out.printf(massiv[i] + " ");}
        System.out.println(" ");


        for (int i = massiv.length - 1; i >= 0; i--) {
            System.out.printf(massiv[i] + " ");}
        System.out.println(" ");


        for (int i = 0; i < massiv.length; i++) {
            System.out.printf(massiv[i]*5 + " ");}
        System.out.println(" ");


        for (int i = 0; i < massiv.length; i++) {
            System.out.printf(massiv[i]*massiv[i] + " ");}
        System.out.println(" ");


        int min_mass = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i] < min_mass) min_mass = massiv[i];}
        System.out.println("minMassiv " + min_mass);


        int first = massiv[0];
        massiv[0] = massiv[6];
        massiv[6]=first;
        String mixedMassiv = Arrays.toString(massiv);
        System.out.println("mixedMassiv " + mixedMassiv);


        for(int i = massiv.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( massiv[j] > massiv[j+1] ){
                    int tmp = massiv[j];
                    massiv[j] = massiv[j+1];
                    massiv[j+1] = tmp;}}}
        String sortedMassiv = Arrays.toString(massiv);
        System.out.println("sortedMassiv "+sortedMassiv);
    }
}


