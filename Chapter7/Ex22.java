// Exercise 22: Create a final class and attempt to inherit from it.

package Chapter7;
final class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }

    public class Ex22 extends Cleanser { // attempting to inherit from a final class
        public void scrub() { 
              append(" Ex2.scrub()"); 
              } 
    public static void main(String[] args) {
      Cleanser x = new Cleanser();
      x.dilute(); x.apply(); x.scrub();
      System.out.println(x);
    }
  }	
}
// Error generated:
// The type Ex22 cannot subclass the final class CleanserJava(16777529)
// It is seen that 'final' classes cannot be inherited from!
