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

/*      Glass glass = new Glass(250,"white");
        Glass glass2 = new Glass(250,"red");

        if(glass.isEmpty()) {System.out.println("стакан пустой ");
        } else {System.out.println("стакан не пустой ");}

        glass.setEffectiveVolume(200);

        System.out.println("в стакане " + glass.getEffectiveVolume() + " мл. воды");
        System.out.println("обьем стаканыа" + glass.getFullVolume() + " мл. воды");
        System.out.println("цвет стакана " + glass.getColor() + " или " + glass2.getColor());*/

    }
}
/*- в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
- открыть поочередно все бутылки и выпустить из них газ*/