// Exercise 1: Create a simple class. Inside a second class, define a reference to an object 
//of the first class. Use lazy initialization to instantiate this object. 

package Chapter7;

class SimpleClass {}

class SecondClass {
 SimpleClass simple;
  
  String Simple() {
    simple = new SimpleClass();
    return "Hello World; \nHere, we're using lazy initialization to instantiate a class: " + simple;
  }
}

public class Ex1 {
    public static void main(String[] args) {
        SecondClass c = new SecondClass();
        System.out.println(c.simple);
        System.out.println(c.Simple());
      }
}
// Output:
// null
// Hello World; 
// Here, we're using lazy initialization to instantiate a class: Chapter7.SimpleClass@36baf30c