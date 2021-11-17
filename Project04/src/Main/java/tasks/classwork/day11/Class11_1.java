package tasks.classwork.day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Class11_1 {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("t.tmp");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream("t.tmp");
             ) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


/*        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("t.tmp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }

//        try {
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }*/
    }
}