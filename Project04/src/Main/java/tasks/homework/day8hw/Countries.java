package tasks.homework.day8hw;

//Создать пустой список стрингов countries
//Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
//Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
//Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль с новой строки

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String str1 : countries) {
            System.out.print(str1 + ", ");
        }
        System.out.println();

        int counter = 0;
        for (String str2 : countries) {
            if (str2.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < countries.size(); ++i) {
            System.out.println(countries.get(i));
        }

    }
}