package tasks.classwork.day08;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        String mama = "мама мыла раму";

        for (String strValue : mama.split(" ")) {
            myList.add(strValue);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String str2 : myList) {
            System.out.println(str2);
        }

    }
}
