package tasks.homework.day8hw;

/*Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) через (Sets.newHashSet())
Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
Найти и удалить из набора авто, в названии которых больше 4 букв
Проитерировать список через for-each и отпечатать слова в консоль через пробел*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cars {
    public static void main(String[] args) {

        Set<String> cars = new HashSet<>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));
        Iterator<String> iterator = cars.iterator();

        for (String str1 : cars) {
            System.out.println("\"" + str1 + "\"");
        }
        System.out.println();

        while (iterator.hasNext()) {
            if (iterator.next().length() > 4) {
                iterator.remove();
            }
        }

        for (String str2 : cars) {
            System.out.print(str2 + " ");
        }

    }
}
