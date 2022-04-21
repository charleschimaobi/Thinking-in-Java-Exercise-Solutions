/*
Exercise 2: (1) Write a method that takes an int argument and returns an array of that
size, filled with BerylliumSphere objects.
 */
package Chapter16;

import java.util.Arrays;

public class Ex2 {
    public static BerylliumSphere[] method(int n) {
        BerylliumSphere[] b = new BerylliumSphere[n];
        for(int i = 0; i < n; i++)
            b[i] = new BerylliumSphere();
        return b;
    }
    public static void test(BerylliumSphere[] a) {
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        test(method(5));
    }

}
/*
[Sphere 0, Sphere 1, Sphere 2, Sphere 3, Sphere 4]

Process finished with exit code 0
 */