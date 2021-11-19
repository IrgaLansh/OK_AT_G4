package tasks.classwork.day04;

public class Radio implements Speakable{

    public void speak(String phrase) {
        System.out.println("RAADoi BA " + phrase);
    }

    public void shout(String phrase) {
        System.out.println("Radio 101.2 "+phrase);

    }
}
