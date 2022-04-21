// Exercise 2 of chapter 5: Create a class with a String field that is initialized at the point of 
//definition, and another one that is initialized by the constructor. What is the difference 
//between the two approaches?
//COMMENTS:
// Thus, the difference is that If a class has a constructor, Java automatically calls 
// that constructor when an object is created as evidenced as shown with "c2" below.

public class Ex2{
    String c1 = "Initialized at the point of definition";
    String c2;
    Ex2(){// the constructor
    c2 = "Initialized at the constructor";
    }
    public static void main(String[]args){
    //TODOAuto-generatedmethodstub
    Ex2 a = new Ex2();
    System.out.println(" First: " + a.c1);
    System.out.println(" Second: " + a.c2);
    }
}
// Output:
//First: Initialized at the point of definition
// Second: Initialized at the constructor