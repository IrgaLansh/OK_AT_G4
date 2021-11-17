package tasks.homework.day8hw.objectClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterRunner {

    public static void main(String[] args) {

        List<Water> water = new ArrayList<>(Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")));

        for (Water quality : water) {
            System.out.println(quality.getColor() + " - " + quality.getSmell());
        }
    }
}

