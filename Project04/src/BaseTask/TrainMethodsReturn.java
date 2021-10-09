package BaseTask;

public class TrainMethodsReturn {

    private int chyslo = 22;
    private long chyslo2 = 1490985;
    private char litera = 'f';
    private float drob = (float) 2.16;
    private double bigDrob = 262565247272.163465363636656;
    private short korotk = 1;
    private byte bita = 98;
    private boolean logic = true;

    public void returnNewInt() {
        chyslo *= 3;
        System.out.println("method returnNewInt returns " + chyslo);
    }

    public void returnNewLong() {
        chyslo2 -= 4;
        System.out.println("method returnNewLong returns " + chyslo2);
    }

    public void returnNewChar() {
        System.out.println("method returnNewChar returns " + litera + litera);
    }

    public void returnNewFloat() {
        System.out.println("method returnNewFloat returns " + drob / 2);
    }

    public void returnNewDouble() {
        bigDrob += 8;
        System.out.println("method returnNewDouble returns " + bigDrob);
    }

    public void returnNewShort() {
        korotk = (short) (korotk - 1);
        System.out.println("method returnNewShort returns " + korotk);
    }

    public void returnNewByte() {
        bita = (byte) (bita *2);
        System.out.println("method returnNewByte returns " + bita);
    }

    public void returnNewBoolean() {
        logic = !logic;
        System.out.println("method returnNewBoolean returns " + logic);
    }

}