package Demo.Day02;

import java.util.Random;

public class ForEach {
    public void foo3() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
            array[i] = random.nextInt(100);
        }
        int sum = 0;
        for (int i : array) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum / array.length);
    }

     //   System.out.println("Average value is : ");
}

