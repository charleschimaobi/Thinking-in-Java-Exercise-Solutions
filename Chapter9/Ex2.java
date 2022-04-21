// Exercise 2: Create a class as abstract without including any abstract methods and 
// verify that you cannot create any instances of that class. 

package Chapter9;

 abstract class MyAbstractClass{
    String s (){
        return "Hello";
    }
    void c (){
        System.out.println("Welcome");
    }
} 
public class Ex2 {
    public static void main(String[] args) {
    MyAbstractClass a = new MyAbstractClass();
}
}
// Error generated:
// Cannot instantiate the type MyAbstractClass