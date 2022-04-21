// Exercise 28: Modify Exercise 4 so that the custom exception class inherits from 
// RuntimeException, and show that the compiler allows you to leave out the try block. 

package Chapter12;

class MyException extends RuntimeException { 
    public MyException(String msg) { super(msg); }
    
        void f() throws MyException { 
        System.out.println("Throwing MyException from f()"); 
        throw new MyException("Originated in f()"); 
        }  
   
public class Ex28 {
    public static void main(String[] args) {
        MyException me = new MyException("Hi");
        me.f(); 
    
        // Thus, below show that the compiler allows you to leave out the try block when using RuntimeException:
        
       /*
        try { 
        f(); 
        } catch(MyException e) { 
        e.printStackTrace(System.out); 
        }
        *///
}
}
}
/* Output:
Throwing MyException from f()
Exception in thread "main" Chapter12.MyException: Originated in f()
        at Chapter12.MyException.f(Ex28.java:8)
        at Chapter12.MyException$Ex28.main(Ex28.java:14)
*///