// Exercise 24: In Beetle.java, inherit a specific type of beetle from class Beetle, 
// following the same format as the existing classes. Trace and explain the output.

package Chapter7;

class Insect {
     private int i = 9;
    protected int j;
    Insect() {
      System.out.println("i = " + i + ", j = " + j);
      j = 39;
    }


    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
      System.out.println(s);
      return 47;
    }
  }
  
  class Beetle extends Insect {
    private int k = printInit("Beetel.k initialized");
    Beetle() {
      System.out.println("k = " + k);
      System.out.println("j = " + j);
    }
    
    private static int x2 = printInit("static Beetle.x2 initialized");
  }
  
public class Ex24 extends Beetle {
    private int i = printInit("Ex24.l initialized");
  Ex24() {
    System.out.println("i = " + i);
    System.out.println("j = " + j);
  }
  private static int x3 = printInit("static Ex24.x3 initialized");

  public static void main(String[] args) {
    System.out.println("Ex24 constructor");
    Ex24 c = new Ex24();
  }
}
// Output:
// static Insect.x1 initialized
// static Beetle.x2 initialized
// static Ex24.x3 initialized
// Ex24 constructor
// i = 9, j = 0
// Beetel.k initialized
// k = 47
// j = 39
// Ex24.l initialized
// i = 47
// j = 39

// COMMENTS:
// Tracing the form of the output, we can see that when the Beetle.main is run, the loader locates all the static method and run them first.
// Next, the static initialization in the root base class (in this case, Insect) is performed, and 
// then the next derived class, and so on.
// When the necessary classes have all been loaded, the object is then created. First, all 
// the primitives in this object are set to their default values and the object references are set to 
// null. Then the base-class constructor will be called. 