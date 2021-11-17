package tasks.homework.stream;
//- построчно прочитать файл и создать стрим из его строк, пропустив первые 4 строки собрать коллекцию в отдну строку,
//разделить на по <br>, оставить только те, что начинаются с "Date log:", в каждой строке оставить только первые 20 символов,
// к каждой в конец дописать значение текущей даты

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class StreamFile {

    public static void main(String[] args) throws IOException {

        System.out.println(Files.lines(Paths.get("log.txt")).skip(4)
                .filter(i -> i.startsWith("Date log:"))
                .map(i -> i.substring(0, Math.min(i.length(), 20)))
                .map(i -> i + " " + LocalDate.now())
                .collect(Collectors.joining(" <br>")));
    }
}
