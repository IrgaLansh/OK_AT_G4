package tasks.homework.day8hw.objectClasses;

//Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать обьемы в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Посчитать обьем всех пузырей и вывести число в консоль
//Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки

import java.util.Objects;

public class Bubble {

    private int volume;
    private String name;

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bubble{" + "volume=" + volume + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bubble bubble = (Bubble) obj;
        return volume == bubble.volume && Objects.equals(name, bubble.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, name);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}