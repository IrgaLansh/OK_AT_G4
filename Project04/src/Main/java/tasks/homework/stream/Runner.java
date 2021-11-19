package tasks.homework.stream;
//Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
//Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых
// меньше 21, выводит их имена и возраст в консоль, сортирует по фамилии,
//а потом по имени(использовать thenComparing у объекта Comparator),
//берет 4 первых человека, формирует коллекцию из имен объектов, собирает все в коллекцию

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {

//    public static String getRandomString ( int length){
//        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//        Random random = new Random();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < length; i++) {
//            int number = random.nextInt(8);
//            sb.append(str.charAt(number));
//        }
//        return sb.toString();
//    }

    public static void main(String[] args) {

     //   RandomString gen = new getRandomString(8, ThreadLocalRandom.current());

        List<String> personList = IntStream.rangeClosed(1, 100).boxed().
                map(i -> new Person("name" + (Long.toHexString(Double.doubleToLongBits(Math.random()))), "fghj", ThreadLocalRandom.
                        current().nextInt(15, 30))).
                filter(i -> i.getAge() < 21)
                .peek(p -> System.out.println(p.getName() + " " + p.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(personList);

    }
}