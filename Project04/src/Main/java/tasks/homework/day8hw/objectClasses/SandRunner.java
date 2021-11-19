package tasks.homework.day8hw.objectClasses;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SandRunner {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>(Arrays.asList(
                new Sand(2, "Речной"),
                new Sand(4, "Речной"),
                new Sand(2, "Карьерный"),
                new Sand(7, "Речной")));
        Map<Integer, Sand> sandMap = new HashMap<>();

        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();

        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(sandMap.size(), sandbox.get(i));
        }

        for (int sandKey : sandMap.keySet()) {
            System.out.print(sandKey + " ");
        }
        System.out.println();

        for (Sand sand : sandMap.values()) {
            System.out.print(sand + " ");
        }
        System.out.println();

        for (Map.Entry keyval : sandMap.entrySet()) {
            System.out.println(keyval);
        }
    }
}

