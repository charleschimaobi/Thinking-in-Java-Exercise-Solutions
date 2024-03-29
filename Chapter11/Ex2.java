// Exercise 2: Modify SimpleCollection.java to use a Set for c.

package Chapter11;
import java.util.*;
public class Ex2 {
    public static void main(String[] args) { 
        Set<Integer> c = new LinkedHashSet<Integer>(); 
        for(int i = 0; i < 10; i++) 
        c.add(i); // Autoboxing 
        for(Integer i : c) 
        System.out.print(i + ", "); 
        } 
       
}
// Output:
// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,