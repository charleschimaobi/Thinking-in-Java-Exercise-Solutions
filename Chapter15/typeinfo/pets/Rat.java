package typeinfo.pets;

import static com.charles.Main.print;

public class Rat extends Rodent{
    public Rat(String name) { super(name); }
    public Rat() { super(); }
    public String Speak() {
        return "This is Rat";
    }
}
