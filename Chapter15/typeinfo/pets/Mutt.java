package typeinfo.pets;

import static com.charles.Main.print;

public class Mutt extends Dog{
    public Mutt(String name) { super(name); }
    public Mutt() { super(); }
    public String Speak() {
        return "This is Mutt";
    }
}
