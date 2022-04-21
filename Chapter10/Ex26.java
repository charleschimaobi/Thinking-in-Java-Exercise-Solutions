// Exercise 26: (2) Create a class with an inner class that has a non-default constructor 
// (one that takes arguments). Create a second class with an inner class that inherits from the 
// first inner class

package Chapter10;

class FirstOuter {
	class FirstInner {
		FirstInner(int i) { 
            System.out.println("FirstOuter.FirstInner(" + i + ")");
         }
	}
}

 class SecondOuter {
	public class SecondInner extends FirstOuter.FirstInner {
		SecondInner(FirstOuter fo, int i) {
			fo.super(i);
			System.out.println("SecondOuter.SecondInner(" + i + ")" );
		}
	}
public class Ex26 {
    public static void main(String[] args) {
		FirstOuter fo = new FirstOuter();
		SecondOuter so = new SecondOuter();
		SecondInner si = so.new SecondInner(fo, 10);
	}
}
}
// FirstOuter.FirstInner(10)
// SecondOuter.SecondInner(10)