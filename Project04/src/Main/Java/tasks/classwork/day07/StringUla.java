package tasks.classwork.day07;

import java.util.Arrays;

public class StringUla {
    public static void main(String[] args) {

        String[] arr = "fgdfgdf".split("[\\D]+");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));

//        int[] out = new int[10];
        int counter = 0;

        for (String s : arr) {
            if (!s.equals((""))) {
                counter++;
                System.out.println(s);

            }
        }
        int[] finIntArr = new int[counter];

        for (String s : arr) {
            if (!s.equals((""))) {
                finIntArr[counter-- - 1] = Integer.parseInt(s);
            }
        }

        for (int s : finIntArr) {
            System.out.println(s);
        }
    }
}
