// Exercise 17: (2) Prove that the fields in an interface are implicitly static and final. 

package Chapter9;

interface FinalField { 
    int i = 10;
    String s = "Hi";
    
}
public class Ex17 implements FinalField {
    public static void main(String[] args){
        Ex17 a = new Ex17();
        i = 20;
        s = "Hello";
        System.out.println(a.i);
        System.out.println(a.s); 
}
}
// Exception in thread ...:
// The final field FinalField.i cannot be assigned
// The final field FinalField.s cannot be assigned
