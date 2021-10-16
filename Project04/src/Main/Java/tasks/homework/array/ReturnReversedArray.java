package tasks.homework.array;

import java.util.Random;

public class ReturnReversedArray {

    public void returningArray(int nNumber) {

        int[] numberArray = new int[20];
        Random random = new Random();

        for (int i = nNumber; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(20);System.out.print(numberArray[i] + " ");
        }
        System.out.println();

        System.out.println("Reversed Elements ");
        for (int i = numberArray.length +1 - nNumber ; i >= 0; i--) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.println();

    }
}