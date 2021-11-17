package tasks.homework.day8hw.objectClasses;

import java.util.*;

public class ChairRunner {

    public static void main(String[] args) {

        List<Chair> furniture = new ArrayList<>(Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)));
        Map<Integer, Chair> chairsMap = new HashMap<>();

        for (Chair chair : furniture) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }
        System.out.println();

        for (int i = 0; i < furniture.size(); i++) {
            chairsMap.put(i, furniture.get(i));
        }

        for (int key : chairsMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Chair chair : chairsMap.values()) {
            System.out.print(chair + " ");
        }
        System.out.println();

        for (Map.Entry keyval : chairsMap.entrySet()) {
            System.out.println(keyval);
        }
    }
}