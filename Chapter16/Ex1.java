/*
Exercise 1: (2) Create a method that takes an array of BerylliumSphere as an
argument. Call the method, creating the argument dynamically. Demonstrate that ordinary
aggregate array initialization doesn’t work in this case. Discover the only situations where
ordinary aggregate array initialization works, and where dynamic aggregate initialization is
redundant.
 */
package Chapter16;

import java.util.*;

public class Ex1 {
    public static void method (BerylliumSphere[] b ){
        System.out.println(Arrays.asList(b));
    }
    public static void main(String[] args) {

        // Calling the method and creating the argument dynamically
        method(new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});

        // ordinary aggregate array initialization doesn't work that way:
        // method({ new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});

        // only situations where ordinary aggregate array initialization works:
        BerylliumSphere[] b1 = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        method(b1);

        // Dynamic aggregate array initialization is redundant here:
        BerylliumSphere[] bs2 = new BerylliumSphere[]{ new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        method(bs2);
    }
}
/* Output:
[Sphere 0, Sphere 1, Sphere 2, Sphere 3]
[Sphere 4, Sphere 5, Sphere 6, Sphere 7]
[Sphere 8, Sphere 9, Sphere 10, Sphere 11]

Process finished with exit code 0
 */