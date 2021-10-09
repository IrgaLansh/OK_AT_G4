package Bubbles;

import Demo.Day02.Glass;

public class BubbleRunner {
    public static void main(String[] args) {

        Bottle myLitBottle = new Bottle(0.5,true);
        Bottle myMidBottle = new Bottle(1,true);
        Bottle myBigBottle = new Bottle(1.5,true);

        myLitBottle.open();
        myMidBottle.open();
        myBigBottle.open();

/**/

    }
}
/*- в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
- открыть поочередно все бутылки и выпустить из них газ*/