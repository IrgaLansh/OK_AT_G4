package project.homework.BaseTask;

public class TrainMethodsIf {


    private String characterCombo;

    public int returnNewInt(int intNumber) {
        if (intNumber < 8) {
            intNumber *= 7;
        } else {
            intNumber /= 4;
        }
        return intNumber;
    }

    public long returnNewLong(long longNumber) {
        if (longNumber > 300) {
            longNumber -= 300;
        } else {
            longNumber += 20;
        }
        return longNumber;
    }

    public String returnNewChar(char character) {
        if (character == 'g') {
            characterCombo = character + "o";
        } else {
            characterCombo = "o" + character;
        }
        return characterCombo;
    }

    public float returnNewFloat(float floatNumber) {
        if (floatNumber != 0.67) {
            floatNumber *= 2;
        }
        return floatNumber;
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
        return doubleNumber;
    }

    public boolean returnNewBoolean(boolean booleanValue) {
        return booleanValue;
    }
}
