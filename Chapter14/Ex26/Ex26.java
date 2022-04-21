// Exercise 26: (3) Implement clearSpitValve( ) as described in the summary.

package Chapter14.Ex26;
import java.util.Random;

import static com.charles.Main.print;

class RandomInstrumentGenerator {
    Random rand = new Random();
    public Instrument next() {
        switch(rand.nextInt(7)) {
            default:
            case 0: return new Wind();
            case 1: return new Guitar();
            case 2: return new Stringed();
            case 3: return new Keyboard();
            case 4: return new Brass();
            case 5: return new Woodwind();
            case 6: return new Piano();

        }
    }
}

class Instrument {
    void play(Note n) { print("Instrument.play()" + n); }
    public String toString() { return "Instrument"; }
    void prepareInstrument() { print("Preparing instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { print("Wind.play()" + n); }
    public String toString() { return "Wind"; }
    void prepareInstrument() { print("preparing Wind"); }
    void clearSpitValve() { print("Clearing spit valve (Wind)"); };
}

class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play()" + n); }
    public String toString() { return "Stringed"; }
    void prepareInstrument() { print("Preparing Stringed"); }
}

class Keyboard extends Instrument {
    void play(Note n) { print("Keyboard.play()" + n); }
    public String toString() { return "Keyboard"; }
    void prepareInstrument() { print("Preparing Keyboard"); }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play()" + n); }
    public String toString() { return "Brass"; }
    void prepareInstrument() { print("Preparing Brass"); }
    void clearSpitValve() { print("Clearing spit valve (Brass)"); };
}

class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play()" + n); }
    public String toString() { return "Woodwind"; }
    void prepareInstrument() { print("preparing Woodwind"); }
    void clearSpitValve() { print("Clearing spit valve (Woodwind)"); };
}

class Piano extends Keyboard {
    void play(Note n) { print("Piano.play()" + n); }
    public String toString() { return "Piano"; }
    void prepareInstrument() { print("Preparing Piano"); }
}

class Guitar extends Stringed {
    void play(Note n) { print("Guitar.play()" + n); }
    public String toString() { return "Guitar"; }
    void prepareInstrument() { print("Preparing Guitar"); }
}

public class Ex26 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] instruments) {
        for(Instrument i : instruments) {
            tune(i);
        }
    }
    private static RandomInstrumentGenerator generator = new RandomInstrumentGenerator();
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[10];
        for(int i = 0; i < orchestra.length; i++) {
            orchestra[i] = generator.next();
        }
        for(Instrument i : orchestra) {
            // clearing spit valves of all orchestra instruments
            if(i instanceof Wind)
                ((Wind)i).clearSpitValve();
            // preparing all orchestra instruments
            i.prepareInstrument();
        }
        System.out.println();
        tuneAll(orchestra);
    }
}
/* Output:
Preparing Keyboard
Preparing Stringed
Preparing Piano
Preparing Keyboard
Preparing Guitar
Preparing Guitar
Preparing Guitar
Preparing Stringed
Preparing Keyboard
Clearing spit valve (Wind)
preparing Wind

Keyboard.play()MIDDLE_C
Stringed.play()MIDDLE_C
Piano.play()MIDDLE_C
Keyboard.play()MIDDLE_C
Guitar.play()MIDDLE_C
Guitar.play()MIDDLE_C
Guitar.play()MIDDLE_C
Stringed.play()MIDDLE_C
Keyboard.play()MIDDLE_C
Wind.play()MIDDLE_C

Process finished with exit code 0

 */
