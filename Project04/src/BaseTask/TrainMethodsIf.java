package BaseTask;

public class TrainMethodsIf {


    private String characterCombo;

    public int returnNewInt(int intNumber) {
        if (intNumber < 8) {intNumber *= 7;} else{ intNumber /= 4;}
        return intNumber;
//        System.out.println("method returnNewInt returns " + intNumber);
    }

    public long returnNewLong(long longNumber) {
        if (longNumber > 300) {
            longNumber -= 300;
        } else {
            longNumber += 20;
        }
        return longNumber;
//        System.out.println("method returnNewLong returns " + longNumber);
    }

    public String returnNewChar(char character) {
        if (character == 'g') {
            characterCombo = character + "o";
        } else {
            characterCombo = "o" + character;
        }
        System.out.println("method returnNewChar returns " + characterCombo);
        return characterCombo;
    }

    public float returnNewFloat(float floatNumber) {
        if (floatNumber != 0.67) {
            floatNumber *= 2;
        }
        return floatNumber;
        //System.out.println("method returnNewFloat returns " + floatNumber);
    }

    public double returnNewDouble(double doubleNumber) {
        if (doubleNumber > 30 & doubleNumber < 80) {
            doubleNumber += 87;
        } else {
            if (doubleNumber > 80 & doubleNumber < 400) {
                doubleNumber -= 87;
            } else {
                if (doubleNumber > 400) {
                    doubleNumber /= 4;
                }
            }
        }
        System.out.println("method returnNewDouble returns " + doubleNumber);
        return doubleNumber;
    }

    public boolean returnNewBoolean(boolean booleanValue) {
        System.out.println("I receive " + booleanValue);
        return booleanValue;
    }
}
