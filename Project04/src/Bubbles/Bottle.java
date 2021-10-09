package Bubbles;

public class Bottle {
    double bottleVolume;
    boolean waterInside;


    public Bottle(double bottleVolume, boolean waterInside){
        this.bottleVolume = bottleVolume;
        this.waterInside = waterInside;}

    public double getBottleVolume() {return bottleVolume;}
    public void setBottleVolume(double bottleVolume) {this.bottleVolume = bottleVolume;}
    public boolean isWaterInside() {return waterInside;}
    public void setWaterInside(boolean waterInside) {this.waterInside = waterInside;}

/**/

    public void open(){
        SparklingWater mySW = new SparklingWater();
        mySW.degas();

    }
}


