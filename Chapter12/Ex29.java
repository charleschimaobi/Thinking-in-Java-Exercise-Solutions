// Exercise 29: Modify all the exception types in Stormylnning.java so that they 
// extend RuntimeException, and show that no exception specifications or try blocks are 
// necessary. Remove the ‘//!’ comments and show how the methods can be compiled without 
// specifications. 

package Chapter12;
class BaseballException extends RuntimeException {}
class Foul extends RuntimeException {}
class Strike extends RuntimeException {}

abstract class Inning {
  public Inning() {}
  public void event() {}
  public abstract void atBat();
  public void walk() {}
}

class StormException extends RuntimeException {}
class RainedOut extends RuntimeException {}
class PopFoul extends RuntimeException {}

interface Storm {
  public void event();
  public void rainHard();
}

class StormyInning extends Inning implements Storm {
  public StormyInning() {}
  public StormyInning(String s) {}
  public void walk() {}
  public void event() {}
  public void rainHard() {}
  public void atBat() {}  
public class Ex29 {
    public static void main(String[] args) { 
        StormyInning si = new StormyInning(); 
        si.atBat();
         
        Inning i = new StormyInning(); // Upcasting 
        i.atBat(); 
         
        
        } 
       
}
}
/* Output:
*/