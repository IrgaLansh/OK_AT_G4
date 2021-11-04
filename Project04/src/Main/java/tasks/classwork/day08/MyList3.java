package tasks.classwork.day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyList3 {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String mama = "мама мыла раму";

        for (String strValue : mama.split(" ")) {
            mySet.add(strValue);
        }

        for (String str2 : mySet) {
            System.out.println(str2);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.hasNext());
        }
    }
}
