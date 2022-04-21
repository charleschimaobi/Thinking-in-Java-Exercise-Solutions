// Exercise 2: Incorporate a new kind of interface into ToyTest.java and verify that it
// is detected and displayed properly.

package Chapter14;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface NewInterface {}
class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    Toy() {}
    Toy(int i) {}
}
class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots, NewInterface {
    FancyToy() { super(1); }
}
public class Ex2 {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Chapter14.FancyToy");
        } catch(ClassNotFoundException e) {
            System.out.println("Can’t find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor:
            obj = up.newInstance();
        } catch(InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
// Output:
//        Class name: Chapter14.FancyToy is interface? [false]
//        Simple name: FancyToy
//        Canonical name : Chapter14.FancyToy
//        Class name: Chapter14.HasBatteries is interface? [true]
//        Simple name: HasBatteries
//        Canonical name : Chapter14.HasBatteries
//        Class name: Chapter14.Waterproof is interface? [true]
//        Simple name: Waterproof
//        Canonical name : Chapter14.Waterproof
//        Class name: Chapter14.Shoots is interface? [true]
//        Simple name: Shoots
//        Canonical name : Chapter14.Shoots
//        Class name: Chapter14.NewInterface is interface? [true]
//        Simple name: NewInterface
//        Canonical name : Chapter14.NewInterface
//        Class name: Chapter14.Toy is interface? [false]
//        Simple name: Toy
//        Canonical name : Chapter14.Toy

//        Process finished with exit code 0

// Comment:
// Thus, the 'NewInterface' interface incorporated was detected and displayed correctly.
