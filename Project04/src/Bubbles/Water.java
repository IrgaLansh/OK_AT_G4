package Bubbles;
/*
- создать абстрактный класс Water
- у воды есть такие характеристики, цвет, прозрачность, запах, температура
*/
abstract public class Water {
    String Color;
    int Density;
    String Smell;
    int Temprt;
}

class SparklingWater {
/*
- создать класс SparklingWater, являющийся дочерним Water
- у газировки есть пузырьки
- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
- 1 литр воды содержит 10 тыс пузырьков
- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
 */
}