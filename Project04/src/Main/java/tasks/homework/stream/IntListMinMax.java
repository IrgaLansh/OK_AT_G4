package tasks.homework.stream;
//сгенерировать List коллекцию целых чисел из n элементов от
// minValue до maxValue и определить, содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntListMinMax {

    public static void main(String[] args) {

        int minVal = 5;
        int maxVal = 50;

        List<Integer> intList = Stream.iterate(minVal, n -> n + 1).limit(maxVal).collect(Collectors.toList());

        //IntStream.rangeClosed(minVal, maxVal).boxed().map(i -> new ArrayList()).collect(Collectors.toList()).forEach(System.out::println);

        if (intList.stream().anyMatch((i -> (i % 3 == 0 && i % 5 == 0)))) {
            System.out.println("Содержатся");
        } else {
            System.out.println("Не содержатся");
        }
    }
}

