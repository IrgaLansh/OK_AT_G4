package BaseTask;

public class TrainMethodsReturn {

    public int returnNewInt(int integerNumber) {
        return integerNumber * 3;
    }

    public long returnNewLong(long LongNumber) {
        return LongNumber - 4;
    }

    public char returnNewChar(char characterSymbol) {
        return (characterSymbol + characterSymbol);
    }

    public float returnNewFloat(float floatNumber) {
        return floatNumber/2;
    }

    public double returnNewDouble(double doubleNumber) {
        return doubleNumber + 8;
    }

    public short returnNewShort(short shortNumber) {
        return (short) (shortNumber - 1);
    }

    public byte returnNewByte(byte byteNumber) {
        return (byte) (byteNumber * 2);
    }

    public boolean returnNewBoolean(boolean booleanValue) {
        return !booleanValue;
    }

}