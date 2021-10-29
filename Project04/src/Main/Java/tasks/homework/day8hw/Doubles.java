package tasks.homework.day8hw;

import java.util.Arrays;

//Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль черезе пробел
//Посчитать произведение всех чисел и вывести результат в консоль
//найти сумму всех дробных частей и вывести результат в консоль
//Проитерировать список по индексу и челые части в консоль через пробел

public class Doubles {
    public static void main(String[] args) {

        var doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double str1 : doubles) {
            System.out.print(str1 + " ");
        }
        System.out.println();

        double multipl = 1;
        for (int i = 0; i < doubles.size(); i++) {
            multipl *= doubles.get(i);
        }
        System.out.println(multipl);

//        найти сумму всех дробных частей и вывести результат в консоль


//        Проитерировать список по индексу и челые части в консоль через пробел

    }
}
