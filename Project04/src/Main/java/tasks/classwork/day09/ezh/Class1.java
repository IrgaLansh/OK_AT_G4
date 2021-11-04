package tasks.classwork.day09.ezh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Class1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("mama", "myla", "ramu", "mama", "chysto");
//        long num1 = list.stream().filter((x) -> x.equals("мама")).count();
        long num1 = list.stream().filter("mama"::equals).count();

        System.out.println(num1);

        //String str = list.stream().findFirst().orElse("mama");
        System.out.println(list.stream().findFirst().orElse("mama"));

        System.out.println(list.stream().filter((x) -> x.equals("mama")).findFirst().get());

        System.out.println(list.stream().skip(4).findFirst().get());

        System.out.println(Arrays.toString(list.stream().skip(2).limit(2).toArray()));

        System.out.println(list.stream().distinct().filter(x -> x.contains("m")).collect(Collectors.toList()));


    }
}
