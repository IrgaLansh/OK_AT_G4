package tasks.homework.day8hw.objectClasses;

/*Создать список воды (класса Water) water из 3 обьектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки*/

import java.util.Objects;

public class Water {

    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Water{" +
                "color='" + color + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Water water = (Water) o;
        return Objects.equals(color, water.color) && Objects.equals(smell, water.smell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, smell);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
}