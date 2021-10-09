package BaseTask;

public class TrainMethodsIf {

        private int chyslo =19;
        private long chyslo2 = 366;
        private char litera = 'g';
        private String lLitera;
        private float drob = (float) 0.67;
        private double bigDrob = 80;
        private boolean logic = true;

        public void returnNewInt() {
            if (chyslo < 8) {
                chyslo *=7;} else {
                chyslo /=4;}
            System.out.println("method returnNewInt returns " + chyslo);
        }
        public void returnNewLong() {
            if (chyslo2 > 300) {
                chyslo2 -=300;} else {
                chyslo2 +=20;}
            System.out.println("method returnNewLong returns " + chyslo2);
        }
        public void returnNewChar() {
            if (litera == 'g') {
                lLitera = litera +"o";} else {
                lLitera ="o"+ litera;}
            System.out.println("method returnNewChar returns " + lLitera);
        }
        public void returnNewFloat() {
            if (drob ==0.67) {} else {drob *=2;}
            System.out.println("method returnNewFloat returns " + drob);
        }
        public void returnNewDouble() {
            if (bigDrob >30 & bigDrob <80){
                bigDrob +=87;} else {
                if (bigDrob >80 & bigDrob <400){
                    bigDrob -=87;} else {
                    if (bigDrob >400){
                        bigDrob /=4;}}}
            System.out.println("method returnNewDouble returns " + bigDrob);
        }
        public void returnNewBoolean() {
            System.out.println("I receive " + logic);}
        }
