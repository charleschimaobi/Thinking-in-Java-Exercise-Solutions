package typeinfo.pets;

import static com.charles.Main.print;

public class Manx extends Cat {
    public Manx(String name) { super(name); }
    public Manx() { super(); }
    public String Speak() {
        return "This is Manx";
    }
}
