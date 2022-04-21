package typeinfo.pets;

public class Dog extends Pet {
    public Dog(String name) { super(name); }
    public Dog() { super(); }
    public String Speak() {
        return "This is Dog";
    }
}

