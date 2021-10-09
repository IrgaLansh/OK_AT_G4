package CycleTask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        WhileClass myWhC = new WhileClass();
        ForClass myFC = new ForClass();
        CreateMassivClass myCMC = new CreateMassivClass();
        ElementsMassivClass myEMC = new ElementsMassivClass();
        BackElementsClass myBEC = new BackElementsClass();
        UmnozhElementMassivClass myUEMC = new UmnozhElementMassivClass();
        KvadratElementMassivClass myKEMC = new KvadratElementMassivClass();
        MinElementMassivClass myMEMC = new MinElementMassivClass();
        MixFirstLastClass myMFC = new MixFirstLastClass();
        SortClass mySC = new SortClass();

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
