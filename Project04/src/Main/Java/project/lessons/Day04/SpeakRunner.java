package project.lessons.Day04;

public class SpeakRunner {
    public static void main(String[] args) {

        Person person = new Man();
        Man man = new Man();

        man.speak("arrrrghhh");

/*        new Person().speak("bugaga");
        new Dog().speak("tratata");
        new Radio().speak("lalala");

        dogShout(new Dog());
        personShout(new Person());
        radioSpeak(new Radio());*/


        Speakable speakable = new Dog();
        speakAnySpeakable(new Speakable() {
            @Override
            public void speak(String phrase) {
                System.out.println("fgfgfgfgfg");
            }

            @Override
            public void shout(String phrase) {
                System.out.println("rtrtrtrtrtt");
            }
        });


        speakAnySpeakable(new Dog());
        speakAnySpeakable(new Person());
        speakAnySpeakable(new Radio());

    }

    private static void speakAnySpeakable(Speakable speakable) {
        speakable.speak("RR-RR-RR!!!");

    }
/*
    private static void dogShout(Dog dog) {
        dog.shout("RR-RR-RR!!!");
    }
    private static void personShout(Person person) {
        person.speak("too cold today");
    }
    private static void radioSpeak(Radio radio) {
        radio.speak("news");
    }
*/

}
