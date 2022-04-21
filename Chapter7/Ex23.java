// Exercise 23: Prove that class loading takes place only once. Prove that loading may 
// be caused by either the creation of the first instance of that class or by the access of a static
// member.

package Chapter7;

class Print{
    static int printInit(String s){
      System.out.println(s);
      return 0;
    }
  }
  
  class First {
    private static int i = Print.printInit("First class initialized!.");
  
    First() {
      System.out.println("First class constructor!");
    }
    static void a() {
      System.out.println("Static member");
    }
  }
  
  class Second {
    private int i = Print.printInit("Second class initialized!.");
    Second() {
      System.out.println("Second class constructor!");
    }
  
  }
public class Ex23 {
    public static void main(String[] args) {
        System.out.println("Before class loading...");
        First.a(); // accessing of a static member.
        Second b = new Second(); // creation of a first instance of the class B
        First a = new First(); // creation of a first instance of the class A
      }
}
// Output:
// Before class loading...
// First class initialized!.
// Static member
// Second class initialized!.
// Second class constructor!
// First class constructor!