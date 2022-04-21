// Exercise 2: (2) Inherit a new class from class Detergent. Override scrub( ) and add a 
// new method called sterilize( ).

package Chapter7;

class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    System.out.println(x);
  }
}	
   
public class Ex2 extends Cleanser {
    // Change a method: 
    public void scrub() { 
    append(" Ex2.scrub()"); 
    } 
    
    // Add methods to the interface: 
    public void foam() { append(" foam()"); } 
    
    public void sterilize() {
        append(" sterilize()");
      }
    // Test the new class: 
    public static void main(String[] args) { 
    Ex2 x = new Ex2(); 
    x.dilute(); 
    x.apply(); 
    x.scrub(); 
    x.foam(); 
    x.sterilize();
    System.out.println(x); 
    System.out.println("Testing base class:"); 
    Cleanser.main(args); 
    } 
}
// Output:
// Cleanser dilute() apply() Ex2.scrub() foam() sterilize()
// Testing base class:
// Cleanser dilute() apply() scrub()
