// Exercise 31: (3) Modify polymorphism/shape/RandomShapeGenerator.java to 
// make it Iterable. You’ll need to add a constructor that takes the number of elements that 
// you want the iterator to produce before stopping. Verify that it works. 

package Chapter11;
import java.util.*;
import java.util.Random;

class Shape {
	public void draw() {}
	public void erase() {}
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
}

class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
}

class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}
}
class RandomShapeGenerator implements Iterable<Shape>{
    private Random rand = new Random();
    private int num;
  
    public Shape next() {
      switch(rand.nextInt(3)) {
        default:
        case 0: return new Circle();
        case 1: return new Square();
        case 2: return new Triangle();
      }
    }
    public RandomShapeGenerator() {};
  
    public RandomShapeGenerator(int num) {
      this.num = num;
    }
  
    @Override
    public Iterator<Shape> iterator() {
      return new Iterator<Shape>() {
        private int index = 0;
        public boolean hasNext() {
          return index < num;
        }
        public Shape next() {
          index++;
          return RandomShapeGenerator.this.next();
        }
        public void remove() {
          throw new UnsupportedOperationException();
        }
      };
    }
  
  }
  
public class Ex31 {
    public static void main(String[] args){
        List<Shape> shapeList = new ArrayList<Shape>();
        RandomShapeGenerator gen = new RandomShapeGenerator(3);
        Iterator<Shape> it = gen.iterator();
        while (it.hasNext()){
          shapeList.add(it.next());
        }
        System.out.println(shapeList);
      }  
}
// Output:
// [Chapter11.Square@4517d9a3, Chapter11.Square@372f7a8d, Chapter11.Triangle@2f92e0f4]