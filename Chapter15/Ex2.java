/*
Exercise 2: (1) Create a holder class that holds three objects of the same type, along with
the methods to store and fetch those objects and a constructor to initialize all three.
 */
package Chapter15;

class Holder1 {
    private Object a;

    public Holder1(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }
}
class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }
}
class Holder3 {
    private Object a;

    public Holder3(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }
}
    public class Ex2 {
        public static void main(String[] args) {
            Holder1 h1 = new Holder1("Holder1");
            Holder2 h2 = new Holder2("Holder2");
            Holder3 h3 = new Holder3("Holder3");
            h1.set("Using Holder1 Object");
            h2.set("Using Holder2 Object");
            h3.set("Using Holder3 Object");
            System.out.println(h1.get());
            System.out.println(h2.get());
            System.out.println(h3.get());
        }
    }
    /*Output:

Using Holder1 Object
Using Holder2 Object
Using Holder3 Object

Process finished with exit code 0

     */
