package typeinfo.pets;

import static com.charles.Main.print;

public class Mouse extends Rodent{
    public Mouse(String name) { super(name); }
    public Mouse() { super(); }
    public String Speak() {
        return "This is Mouse";
    }
}
