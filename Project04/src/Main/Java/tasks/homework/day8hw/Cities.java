package tasks.homework.day8hw;

/*Создать пустой список стрингов cities
Добавить в список 3 города (Минск, Москва, Берлин)
Проитерировать список через for-each и отпечатать слова в консоль с новой строки
Посчитать сумму всех буков во всех словах и вывести число в консоль
Проитерировать список по индексу и отпечатать слова в консоль через пробел*/

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String str1 : cities) {
            System.out.println(str1);
        }

        int counter = 0;
        for (String str1 : cities) {
            counter += str1.length();
        }
        System.out.println(counter);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}