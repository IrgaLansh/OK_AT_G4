package project.homework.CycleTask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        WhileClass myWhC = new WhileClass();
        ForClass myFC = new ForClass();
        createMassive myCMC = new createMassive();
        ElementsMassivClass myEMC = new ElementsMassivClass();
        ReverseElements myBEC = new ReverseElements();
        UmnozhElementMassivClass myUEMC = new UmnozhElementMassivClass();
        KvadratElementMassivClass myKEMC = new KvadratElementMassivClass();
        MinElementMassivClass myMEMC = new MinElementMassivClass();
        MixFirstLastClass myMFC = new MixFirstLastClass();
        arraySorting mySC = new arraySorting();

        myWhC.myWhileClass();
        myFC.myForClass();
        myCMC.myCreateMassivClass();
/*        myEMC.myElementsMassivClass();
        myBEC.myBackElementsClass();
        myUEMC.myUmnozhElementMassivClass();
        myKEMC.myKvadratElementMassivClass();
        myMEMC.myMinElementMassivClass();
        myMFC.myMixFirstLastClass();
        mySC.mySortClass();  */
    }
}
