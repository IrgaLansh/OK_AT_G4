package tasks.classwork.day08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList2 {
    public static void main(String[] args) {

        List<String> myList1 = new ArrayList();
        List<String> myList2 = new LinkedList();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            myList1.add("мама");
        }
        System.out.println("Время формирования ArrayList " + (System.currentTimeMillis() - t0));

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            myList2.add("мама");
        }
        System.out.println("Время формирования LinkedList " + (System.currentTimeMillis() - t0));
    }
}
