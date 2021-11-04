package tasks.homework.baseTask;

public class TrainMethodsPrimitiveRunner {

    public static void main(String[] args) {

        int integerNumber = 22;
        long LongNumber = 1490985;
        char charSymbol = 'g';
        float floatNumber = 2.16f;
        double doubleNumber = 2625272.16356;
        short shortNumber = 1;
        byte byteNumber = 98;
        boolean booleanValue = true;

        TrainMethodsPrimitive myTrainMethodsPrimitive = new TrainMethodsPrimitive();
        myTrainMethodsPrimitive.printInt(integerNumber);
        myTrainMethodsPrimitive.printLong(LongNumber);
        myTrainMethodsPrimitive.printChar(charSymbol);
        myTrainMethodsPrimitive.printFloat(floatNumber);
        myTrainMethodsPrimitive.printDouble(doubleNumber);
        myTrainMethodsPrimitive.printFloat(shortNumber);
        myTrainMethodsPrimitive.printByte(byteNumber);
        myTrainMethodsPrimitive.printFloat(booleanValue);
    }
}
