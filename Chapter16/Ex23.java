// Exercise 23: (2) Create an array of Integer, fill it with random int values (using
// autoboxing), and sort it into reverse order using a Comparator.
package Chapter16;

import mindview.*;
import java.util.*;

public class Ex23 {
    public static void main(String[] args) {
        Integer[] integers;
        integers = Generated.array(new Integer[15], new RandomGenerator.Integer(100));
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers,Collections.reverseOrder());
        System.out.println(Arrays.toString(integers));
    }
}

/*
[58, 55, 93, 61, 61, 29, 68, 0, 22, 7, 88, 28, 51, 89, 9]
[93, 89, 88, 68, 61, 61, 58, 55, 51, 29, 28, 22, 9, 7, 0]

Process finished with exit code 0

 */