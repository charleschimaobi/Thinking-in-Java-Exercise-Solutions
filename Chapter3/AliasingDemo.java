//Exercise 2 0f chapter 3, topic: Operators
//This shows the effects of two objects referencing the same object, 
//thus when one of the referencing object is manipulated, 
//the change is also observed in the second reference object.

class Academics { 
 float cgpa; 
}
public class AliasingDemo { 
    public static void main(String[] args) { 
    Academics first = new Academics(); 
    Academics second = new Academics(); 
    first.cgpa = 4.00f; 
    second.cgpa = 4.50f; 
    System.out.println("1: first.cgpa: " + first.cgpa + 
    ", second.cgpa: " + second.cgpa); 
    first = second; 
    System.out.print("2: first.cgpa: " + first.cgpa + 
    ", second.cgpa: " + second.cgpa); 
    first.cgpa = 5.00f; 
    System.out.println("\n3: first.cgpa: " + first.cgpa + 
    ", second.cgpa: " + second.cgpa); 
 }
}
//Output:
// 1: first.cgpa: 4.0, second.cgpa: 4.5
// 2: first.cgpa: 4.5, second.cgpa: 4.5
// 3: first.cgpa: 5.0, second.cgpa: 5.0


