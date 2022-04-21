// Exercise 2: (1) Define an object reference and initialize it to null. Try to call a method 
// through this reference. Now wrap the code in a try-catch clause to catch the exception.

package Chapter12;

public class Ex2 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.toString();
        } catch(Exception e) {
            System.out.println("Exception Caught: " + e);
        }
    }
}
// Output:
// Exception Caught: java.lang.NullPointerException: Cannot invoke "String.toString()" because "s" is null