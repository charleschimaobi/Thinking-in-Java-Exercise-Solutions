// Exercise 1: In ToyTest.java, comment out Toy’s default constructor and explain what happens.

package Chapter14;
interface HasBatteries {} 
interface Waterproof {} 
interface Shoots {} 
class Toy {

 // Toy() {}
  Toy(int i) {}
} 
class FancyToy extends Toy 
implements HasBatteries, Waterproof, Shoots { 
 FancyToy() { super(1); } 
}


public class Ex1 {
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
//        Cannot instantiate
//
//        Process finished with exit code 1

// Comments:
// Thus, it can be seen that the class that’s being created with newInstance( ) must have a
// default constructor. Therefore, since the Toy() constructor was commented out,
// its object could not be instantiated!


