package tasks.classwork.day08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyList4 {
    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myList1.add("мама");
        }
        System.out.println("Время формирования HashSet " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myList1.add("мама");
        }
        System.out.println("Время формирования HashSet " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (String str1 : myList1) {
            System.out.println(str1);
        }
        System.out.println("Время формирования HashSet " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (String str2 : myList2) {
            System.out.println(str2);
        }
        System.out.println("Время формирования HashSet " + (System.currentTimeMillis() - t0));
    }
}
