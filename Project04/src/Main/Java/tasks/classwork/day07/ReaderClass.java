package tasks.classwork.day07;

import java.io.*;

public class ReaderClass {
    public static void main(String[] args) throws IOException {
//        file.txt

        //read();
       write();

    }

    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public static void write() throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("file.txt"));
        out.write("папа мыла раму");
        out.newLine();
        out.write("папа мыла раму");
        out.close();
    }
}

