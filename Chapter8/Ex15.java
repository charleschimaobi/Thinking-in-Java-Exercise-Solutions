// Exercise 15: (2) Add a RectangularGlyph to PolyConstructors.java and 
// demonstrate the problem described in this section. 

package Chapter8;
class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
      print("Glyph() before draw()");
      draw();
      print("Glyph() after draw()");
    }
    public void print(String s) {
      System.out.println(s);
    }
  }
  
  class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
      radius = r;
      print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
      print("RoundGlyph.draw(), radius = " + radius);
    }
  }
  
  class RectangularGlyph extends Glyph {
    private int first = 10;
    private int second = 20;
  
    RectangularGlyph(int l, int s) {
      first = l;
      second = s;
      print("RectangularGlyph.RectangularGlyph() , First integer = " + first +
      ", Second integer = " + second);
    }
  
    void draw() {
      print("RectangularGlyph.draw(), First integer = " + first +
      ", Second integer = " + second);
    }
  }
  
public class Ex15 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(100, 200);
      }
}
// Output:
// Glyph() before draw()
// RoundGlyph.draw(), radius = 0
// Glyph() after draw()
// RoundGlyph.RoundGlyph(), radius = 5
// Glyph() before draw()
// RectangularGlyph.draw(), First integer = 0, Second integer = 0
// Glyph() after draw()
// RectangularGlyph.RectangularGlyph() , First integer = 100, Second integer = 200