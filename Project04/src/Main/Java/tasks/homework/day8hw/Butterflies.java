package tasks.homework.day8hw;

//Создать пустой список стрингов butterflies (через new ArrayList)
//Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
//Проитерировать список через for-each и отпечатать слова в консоль в кавычках
//Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Проитерировать список через for-each и отпечатать слова в консоль через перенос строки

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        int counter = 0;
        for (String str1 : butterflies) {
            System.out.println("\"" + str1 + "\"");
            if (str1.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String str2 : butterflies) {
            System.out.println(str2);
        }

    }
}
