package typeinfo.pets;

import static com.charles.Main.print;

public class Hamster extends Rodent{
    public Hamster(String name) { super(name); }
    public Hamster() { super(); }
    public String Speak() {
        return "This is Hamster";
    }
}
