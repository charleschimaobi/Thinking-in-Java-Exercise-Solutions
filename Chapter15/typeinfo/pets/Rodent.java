package typeinfo.pets;

import static com.charles.Main.print;

public class Rodent extends Pet{
    public Rodent(String name) { super(name); }
    public Rodent() { super(); }
    public String Speak() {
        return "This is Rodent";
    }
}
