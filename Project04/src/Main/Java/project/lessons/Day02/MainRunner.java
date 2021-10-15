package project.lessons.Day02;

public class MainRunner {
    public static void main(String[] args) {


        //MyFirstClass myFirstClassRunner = new MyFirstClass();
        //myFirstClassRunner.myMethod();
        //new MyFirstClass().myMethod();
        //MyFirstClass vasya = new MyFirstClass();
        //vasya.myMethod();

//        BreakDemo myBreak = new BreakDemo();
//        myBreak.foo();
Break2 myBreak2 = new Break2();
//        Break2 myBreak2 = new Break2();
//        myBreak2.foot();

//        ForEach myFE = new ForEach();
//        myFE.foo3();

        Glass glass = new Glass(250,"white");
        Glass glass2 = new Glass(250,"red");

        if(glass.isEmpty()) {
            System.out.println("стакан пустой ");
        } else {
            System.out.println("стакан не пустой ");
        }

        glass.setEffectiveVolume(200);

        System.out.println("в стакане " + glass.getEffectiveVolume() + " мл. воды");
        System.out.println("обьем стаканыа" + glass.getFullVolume() + " мл. воды");
        System.out.println("цвет стакана " + glass.getColor() + " или " + glass2.getColor());

        if(glass.isEmpty()) {
            System.out.println("стакан пустой ");
        } else {
            System.out.println("стакан не пустой ");
        }

    }

}
