// Exercise 1: (2) Analyze SprinklerSystem.toString( ) in 
// reusing/SprinklerSystem.java to discover whether writing the toString( ) with an 
// explicit StringBuilder will save any StringBuilder creations. 

package Chapter13;

class WaterSource {
    private String s;
    WaterSource() {
      System.out.println("WaterSource()");
      s = "Constructed";
    }
    public String toString() { return s; }
  }	
  
   class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        StringBuilder result = new StringBuilder();
      //return
        result.append("valve1 = " + valve1 + " " +
        "valve2 = " + valve2 + " " +
        "valve3 = " + valve3 + " " +
        "valve4 = " + valve4 + "\n" +
        "i = " + i + " " + "f = " + f + " " +
        "source = " + source);
        return result.toString();
    }	
public class Ex1 {
    public static void main(String[] args) { 
 SprinklerSystem sprinklers = new SprinklerSystem(); 
 System.out.println(sprinklers); 
 } 
}
}
// Output:
// WaterSource()
// valve1 = null valve2 = null valve3 = null valve4 = null
// i = 0 f = 0.0 source = Constructed
