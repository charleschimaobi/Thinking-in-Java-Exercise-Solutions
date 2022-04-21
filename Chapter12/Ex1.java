// Exercise 1: (2) Create a class with a main( ) that throws an object of class Exception 
// inside a try block. Give the constructor for Exception a String argument. Catch the 
// exception inside a catch clause and print the String argument. Add a finally clause and 
// print a message to prove you were there. 

package Chapter12;

public class Ex1 {
    public static void main(String[] args){
		try {
			throw new Exception("Throwing exception ...");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Here we come! In finally!!");
		}
	}	
}
// Output:
// Throwing exception ...
// Here we come! In finally!!