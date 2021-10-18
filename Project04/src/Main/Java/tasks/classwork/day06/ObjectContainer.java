package tasks.classwork.day06;

public class ObjectContainer {

    Object[] massive = new Object[10];
    int freePlaceNumber;
    boolean space = true;

    public void add(Object incoming) {
        massive[freePlaceNumber] = incoming;
        freePlaceNumber++;
    }

    public Object removeLast() {
        Object last = massive[freePlaceNumber - 1];
        massive[freePlaceNumber-- - 1] = null;
        return last;
    }

    public boolean isEmpty() {
        return freePlaceNumber == 0;
    }

    public boolean isFull() {
        return freePlaceNumber == massive.length - 1;
    }

}
