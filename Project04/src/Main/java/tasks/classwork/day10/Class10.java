package tasks.classwork.day10;

import tasks.classwork.day09.ezh.Person;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Class10 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("mama","myla","ramu","chysto","s","mylom");
        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN), new Person("Катя", 28, Person.Sex.WOMEN), new Person("Вова", 24, Person.Sex.MAN), new Person("Маша", 38, Person.Sex.WOMEN), new Person("Роман Петрович", 72, Person.Sex.MAN));


        list.stream().anyMatch("mama"::equals);

        list.stream().allMatch(i->i.contains("m"));

        list.stream().map(i->i+"m");

        list.stream().flatMap(i-> Arrays.stream(i.split("a"))).filter(s->!s.equals("")).collect(Collectors.toList());

        list.stream().sorted().collect(Collectors.toList());

        list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList());

        people.stream().sorted((x, y) -> {
            if (x.getSex() != (y.getSex())) {
                return x.getSex().compareTo(y.getSex());
            } else {
                return x.getAge() - y.getAge();
            }
            //  }).forEach(System.out::println);    //or
        }).peek(p -> System.out.println(p.name)).collect(Collectors.toList());

//        people.stream().sorted((xx, yy) -> {
//            people.stream()
//                    .sorted((xx, yy) -> xx.sex != yy.sex ? xx.sex.compareTo(yy.sex) : xx.age - yy.age)})
//                    .peek(p -> System.out.println(p.name)).collect(Collectors.toList());

        list.stream().flatMap(x -> Arrays.stream(x.split(""))).peek(x -> System.out.println(x)).max(String::compareTo).get();

        people.stream().min(Comparator.comparingInt(Person::getAge)).get();

        list.stream().map(String::length).mapToInt(x -> (x % 2 == 0 ? 0 : 0)).sum();

        list.stream().collect(Collectors.joining(":", "<p>", "</p>"));

        people.stream().collect(Collectors.toMap(x -> x.hashCode(), y -> y));

        people.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet().forEach(System.out::println);

    }
}


