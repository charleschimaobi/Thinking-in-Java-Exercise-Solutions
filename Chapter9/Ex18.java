// Exercise 18: (2) Create a Cycle interface, with implementations Unicycle, Bicycle 
// and Tricycle. Create factories for each type of Cycle, and code that uses these factories. 

package Chapter9;
interface Cycle {
	public void move();
}

interface CycleFactory {
	public Cycle getCycle();
}

class Unicycle implements Cycle {

	public Unicycle() {}

	public void move() {
		System.out.println("Unicycle has one wheel");
	}

}

class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}
class Bicycle implements Cycle {

	public Bicycle() {}

	public void move() {
		System.out.println("Bicycle has two wheels");
	}

}

class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}
class Tricycle implements Cycle {

	public Tricycle() {}

	public void move() {
		System.out.println("Tricycle has three wheels");
	}

}
class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}

public class Ex18 {
    public void Ride(CycleFactory cycle) {
		cycle.getCycle().move();
	}

	public static void main(String[] args){
		
        Ex18 c = new Ex18();
		
        c.Ride(new UnicycleFactory());
		c.Ride(new BicycleFactory());
        c.Ride(new TricycleFactory());
}
}
// Output:
// Unicycle has one wheel
// Bicycle has two wheels
// Tricycle has three wheels
