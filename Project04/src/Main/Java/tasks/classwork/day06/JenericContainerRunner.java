package tasks.classwork.day06;

import project.boxing.Bottle;

public class JenericContainerRunner {

    public static void main(String[] args) {

        GenericContainer<Integer> genCon = new GenericContainer<>();
        GenericContainer<String> genCon2 = new GenericContainer<>();
        GenericContainer<Bottle> genCon3 = new GenericContainer<>();

        for (int i = 0; i < 0; i++) {
            genCon.add(i);
        }
        System.out.println(genCon + "-created!\n");
        while (!genCon.isEmpty()) {
            Object object = genCon.removeLast();
            if (object instanceof Integer) {
                System.out.println("Number " + object + " removed");
            }
        }
    }
}




