package tasks.classwork.day09.ezh;

import java.util.Arrays;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

//        int counter = 0;
//        for (Person prsn : people) {
//            if ((prsn.getSex().equals(Person.Sex.MAN) && prsn.age > 18 && prsn.age < 60)
//                    || (prsn.getSex().equals(Person.Sex.WOMEN) && prsn.age > 18 && prsn.age < 55)) {
//                counter++;
//            }
//        }
//        System.out.println(counter);

//        long counter = people.stream().filter((p) -> (p.getSex().equals(Person.Sex.WOMEN)&& p.getAge()>18&& p.getAge()<55)
//                ||(p.getSex().equals(Person.Sex.MAN) && p.getAge() > 18 && p.getAge() < 60)).count();
//        System.out.println(counter);

        long counter2 = people.stream().
                filter((p) -> p.getAge() > 18).
                filter((p) -> (p.getSex().equals(Person.Sex.WOMEN) && p.getAge() < 55)).
                filter((p) -> (p.getSex().equals(Person.Sex.MAN) && p.getAge() < 60)).count();
        System.out.println(counter2);

    }
}
