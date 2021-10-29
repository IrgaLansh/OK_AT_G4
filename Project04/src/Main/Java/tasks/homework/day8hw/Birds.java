package tasks.homework.day8hw;

//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
//Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Заменить 3-й элемент списка на Синица
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String birds1 : birds) {
            System.out.println("--" + birds1 + "--");
        }

        //Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        int counter = 0;
        for (String bird : birds) {
            if (bird.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(3, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}