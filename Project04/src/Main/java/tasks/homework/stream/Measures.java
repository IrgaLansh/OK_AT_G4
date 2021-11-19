package tasks.homework.stream;
//- для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах,
// певерести значения в сантиметры и найти сумму

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Measures {
   public static void main(String[] args) {

        List<Integer> inchList = Stream.iterate(1, i -> i + 1)
                .limit(20).filter(i -> i % 2 == 0).filter(i -> (i > 1 && i < 21))
                .collect(Collectors.toList());

        inchList.forEach(System.out::println);

        System.out.println(inchList.stream().mapToDouble(i -> i * 2.54).sum());
    }
}