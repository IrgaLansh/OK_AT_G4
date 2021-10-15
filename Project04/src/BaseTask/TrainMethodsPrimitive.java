package BaseTask;

public class TrainMethodsPrimitive {

    private int chyslo = 22;
    private long chyslo2 = 1490985;
    private String stroka = "dfgh";
    private float drob = (float) 2.16;
    private double bigDrob = 2625272.16356;
    private short korotk = 1;
    private byte bita = 98;
    private boolean logic = true;

    public void printInt() {
        System.out.println("i received number " + chyslo);
    }

    public void printLong() {
        System.out.println("i received long number " + chyslo2);
    }

    public void printChar() {
        System.out.println("i received character " + stroka);
    }

    public void printFloat() {
        System.out.println("i received floating " + drob);
    }

    public void printDouble() {
        System.out.println("i received double " + bigDrob);
    }

    public void printShort() {
        System.out.println("i received short " + korotk);
    }

    public void printByte() {
        System.out.println("i received byte " + bita);
    }

    public void printBoolean() {
        System.out.println("i received logical " + logic);
    }
}
