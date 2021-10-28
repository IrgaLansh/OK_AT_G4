package tasks.classwork.day08;

import java.util.HashMap;
import java.util.Map;

public class MyList5 {
    public static void main(String[] args) {

        String[] array = "мама мыла раму мылом".split(" ");
        Map<Integer,String> words = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            words.put(i,array[i]);
        }

        for (String str1 : words.values()) {
            System.out.println(str1);
        }

        for (int str2 : words.keySet()) {
            System.out.println(str2);
        }

//        for (Map.entry<int,String> entry: words.entrySet()) {
//            System.out.println(entry);
//        }

    }
}
