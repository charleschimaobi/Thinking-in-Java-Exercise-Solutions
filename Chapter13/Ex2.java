// Exercise 2: (1) Repair InfiniteRecursion.java.

package Chapter13;
import java.util.*; 
 class InfiniteRecursion { 
 public String toString() { 
 return " InfiniteRecursion address: " + super.toString( ) + "\n"; 
 } 

public class Ex2 {
    public static void main(String[] args) { 
        List<InfiniteRecursion> v = 
        new ArrayList<InfiniteRecursion>(); 
        for(int i = 0; i < 10; i++) 
        v.add(new InfiniteRecursion()); 
        System.out.println(v); 
        } 
       }
}
// Output:

// [ InfiniteRecursion address: Chapter13.InfiniteRecursion@4617c264
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@36baf30c
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@7a81197d
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@5ca881b5
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@24d46ca6
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@4517d9a3
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@372f7a8d
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@2f92e0f4
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@28a418fc
// ,  InfiniteRecursion address: Chapter13.InfiniteRecursion@5305068a
// ]
