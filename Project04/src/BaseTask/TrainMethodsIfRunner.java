package BaseTask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {
        //TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println("Method returnNewInt returns " + new TrainMethodsIf().returnNewInt(18));
        System.out.println("Method returnNewLong returns " + new TrainMethodsIf().returnNewLong(301));
        System.out.println("Method returnNewChar returns " + new TrainMethodsIf().returnNewChar('h'));
        System.out.println("Method returnNewFloat returns " + new TrainMethodsIf().returnNewFloat(0.68f));
        System.out.println("Method returnNewDouble returns " + new TrainMethodsIf().returnNewDouble(400.00));
        System.out.println(new TrainMethodsIf().returnNewBoolean(true));

    }

}
