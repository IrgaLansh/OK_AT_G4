package tasks.homework.day8hw;

//Создать пустой список стрингов elements
//Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
//Проитерировать список через for-each и отпечатать слова в консоль через пробел
//Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//На 4-ю позицию добавить Spinner
//Удалить 2-й элемент списка
//Заменить 5-й элемент на Switch
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String str1 : elements) {
            System.out.print(str1 + " ");
        }
        System.out.println();

        //Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль





        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        elements.add(4, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");

        for (String str2 : elements) {
            System.out.print(str2 + " ");
        }
    }
}