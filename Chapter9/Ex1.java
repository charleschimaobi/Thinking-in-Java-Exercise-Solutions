// Exercise 1: (1) Modify Exercise 9 in the previous chapter so that Rodent is an abstract
// class. Make the methods of Rodent abstract whenever possible.

package Chapter9;
abstract class Rodent {

    public String eat() {
      return "Rodent eats";
    }
    abstract public void run(); 
  
    abstract public void bite(); 
  }
  class Mouse extends Rodent {

	@Override
	public String eat() {
		return "Mouse eats";
	}
    @Override
    public void run() {
        System.out.println("Mouse runs");
      }
	
	@Override
	public void bite() {
		System.out.println("Mouse bites");
	}
}

class Gerbil extends Rodent {

	@Override
	public String eat() {
		return "Gerbil eats";
	}
    @Override
    public void run() {
        System.out.println("Gerbil runs");
      }
	
	@Override
	public void bite() {
		System.out.println("Gerbil bites");
	}
}

class Hamster extends Rodent {

	@Override
	public String eat() {
		return "Hamster eats";
	}
    @Override
    public void run() {
        System.out.println("Hamster runs");
      }
	
	@Override
	public void bite() {
		System.out.println("Hamster bites");
	}
}

public class Ex1{
public static void main(String[] args) {
    Rodent[] rods = {
      new Mouse(),
      new Gerbil(),
      new Hamster(),
    };
    for (Rodent r : rods) {
      System.out.println(r.eat());
      r.bite();
      r.run();
    }
  }
}
// Output:
// Mouse eats
// Mouse bites
// Mouse runs
// Gerbil eats
// Gerbil bites
// Gerbil runs
// Hamster eats
// Hamster bites
// Hamster runs