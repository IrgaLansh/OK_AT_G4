package tasks.classwork.day06;

public class ColorRunner {
    public static void main(String[] args) {
        String color = "red";
        //if (args[0].equals(NunNum.BLUE)) {System.out.println("df "+NunNum.BLUE); }
        // if (Color.BLUE.equals(args[0])) {System.out.println("I am "+ Color.BLUE); }
        if (ColorNg.BLUE.equals(ColorNg.valueOf(args[0]))) {System.out.println("I am "+ ColorNg.BLUE); }


    }
}
