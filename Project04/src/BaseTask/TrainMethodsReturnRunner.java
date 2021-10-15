package BaseTask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        //TrainMethodsReturn myTrainMethodsReturn = new TrainMethodsReturn();

        System.out.println("method returnNewInt returns " + new TrainMethodsReturn().returnNewInt(22));
        System.out.println("method returnNewLong returns " + new TrainMethodsReturn().returnNewLong(154));
        System.out.println("method returnNewChar returns " + new TrainMethodsReturn().returnNewChar('g'));
        System.out.println("method returnNewFloat returns " + new TrainMethodsReturn().returnNewFloat(22.33f));
        System.out.println("method returnNewDouble returns " + new TrainMethodsReturn().returnNewDouble(27.1634));
        System.out.println("method returnNewShort returns " + new TrainMethodsReturn().returnNewShort((short) 2));
        System.out.println("method returnNewByte returns " + new TrainMethodsReturn().returnNewByte((byte) 22));
        System.out.println("method returnNewBoolean returns " + new TrainMethodsReturn().returnNewBoolean(true));


    }
}
