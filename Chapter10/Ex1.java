// Exercise 1: Write a class named Outer that contains an inner class named Inner. 
// Add a method to Outer that returns an object of type Inner. In main( ), create and 
// initialize a reference to an Inner. 

package Chapter10;
class Outer{
    private int outerValue;
    class Inner{
        public int innerValue;

        void ShowValue(){
            System.out.println("Outer Value = " + outerValue + "\nInner Value = " + innerValue );
        }       
}
public void demo(){
    Inner inner = new Inner();
    inner.ShowValue();
}

}
public class Ex1 {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); 
        inner.innerValue = 10;
        inner.ShowValue();
    }
}
// Output:
// Outer Value = 0
// Inner Value = 10
