package Bubbles;

abstract public class Water {
    String Color;
    int Density;
    String Smell;
    int Temperature;

}

class SparklingWater {
    int bubbles = 10000;

    public void pump(Bubble[] bubbles){}

    public void degas(){
        while (bubbles >0){System.out.println("Cramp!");bubbles--;}
    }
}
/*- 1 литр воды содержит 10 тыс пузырьков
- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье*/