// Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. 
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method. 
package Chapter8;

class Cycle {
    void move() {
      System.out.println("Cycle moves.");
    }
  }
  
  class Unicycle extends Cycle {
    void move() {
      System.out.println("Unicycle has one wheel.");
    }
  }
  
  class Bicycle extends Cycle {
    void move() {
      System.out.println("Bicycle has two wheel.");
    }
  }
  
  class Tricycle extends Cycle {
    void move() {
      System.out.println("Tricycle has three wheel.");
    }
  }
  
     
public class Ex1 {
    static void ride(Cycle c) { // Upcasting..
        c.move();
      }
      
      public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();
        ride(uni); // Using upcasting
        ride(bi); // Using upcasting
        ride(tri); // Using upcasting..
      }
    }
    // Output:
    // Unicycle has one wheel.
    // Bicycle has two wheel.
    // Tricycle has three wheel.
