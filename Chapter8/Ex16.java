// Exercise 16: Following the example in Transmogrify.java, create a Starship class 
// containing an AlertStatus reference that can indicate three different states. Include 
// methods to change the states. 

package Chapter8;

class Starship { 
    public void act() {} 
    
    public void print(String s) {
        System.out.println(s);
      }
   } 
   class Started extends Starship { 
    public void act() { print("Starship is started ..."); }
}
    class Stopped extends Starship { 
    public void act() { print("Starship is stopped."); } 
   }
   class Quit extends Starship { 
    public void act() { print("Starship Quit!"); } 
   }

   class AlertStatus { 
    private Starship st = new Started(); 
    private Starship stp = new Stopped();
    public void change() { st = new Quit(); } 
    public void performPlay() { st.act(); } 
    public void perform() { stp.act(); } 
   }
    
   public class Ex16 {
    public static void main(String[] args) { 
        AlertStatus as = new AlertStatus(); 
        as.performPlay();
        as.perform();  
        as.change(); 
        as.performPlay();
        }
}
// Output:
// Starship is started ...
// Starship is stopped.
// Starship Quit!
