package tasks.classwork.day07;

import java.io.*;

public class MyTableRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Table(12,"red"));
        oos.close();

        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Table table = (Table) ois.readObject();
        ois.close();
        System.out.println(table);
    }
}

