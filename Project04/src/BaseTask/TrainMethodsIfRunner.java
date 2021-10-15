package BaseTask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {
        //TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

/*        new TrainMethodsIf().returnNewInt(18);
        new TrainMethodsIf().returnNewLong(366);
        new TrainMethodsIf().returnNewChar('h');
        new TrainMethodsIf().returnNewFloat(0.67f);
        new TrainMethodsIf().returnNewDouble(123.123);
        new TrainMethodsIf().returnNewBoolean(true);*/

        System.out.println("Method returnNewInt returns " + new TrainMethodsIf().returnNewInt(18));
        System.out.println("Method returnNewLong returns " + new TrainMethodsIf().returnNewLong(366));
        System.out.println("Method returnNewChar returns " + new TrainMethodsIf().returnNewChar('h'));
        System.out.println("Method returnNewFloat returns " + new TrainMethodsIf().returnNewFloat(0.67f));
        System.out.println("Method returnNewDouble returns " + new TrainMethodsIf().returnNewDouble(123.123));
        System.out.println(new TrainMethodsIf().returnNewBoolean(true));

    }

}
