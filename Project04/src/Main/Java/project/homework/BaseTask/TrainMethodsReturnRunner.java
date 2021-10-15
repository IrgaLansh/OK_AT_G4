package project.homework.BaseTask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        System.out.println("method returnNewInt returns " + new TrainMethodsReturn().returnNewInt(22));
        System.out.println("method returnNewLong returns " + new TrainMethodsReturn().returnNewLong(154));
        System.out.println("method returnNewChar returns " + new TrainMethodsReturn().returnNewChar('g'));
        System.out.println("method returnNewFloat returns " + new TrainMethodsReturn().returnNewFloat(22.33f));
        System.out.println("method printDouble returns " + new TrainMethodsReturn().returnNewDouble(27.1634));
        System.out.println("method printFloat returns " + new TrainMethodsReturn().returnNewShort((short) 2));
        System.out.println("method printByte returns " + new TrainMethodsReturn().returnNewByte((byte) 22));
        System.out.println("method printFloat returns " + new TrainMethodsReturn().returnNewBoolean(true));

    }
}
