// Exercise 18: (8) Write a program that reads a Java source-code file (you provide the file
// name on the command line) and displays all the string literals in the code.

package Chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.charles.Main.print;

public class Ex18 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        print("Enter the 'path' of the file you want to read: ");
        File file = new File(scan.next());
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext())
            print(scanner.nextLine());
    }

}
// Output:
/*
Enter the 'path' of the file you want to read:
C:\Users\User\IdeaProjects\MyJavaProject\src\com\charles\Revision.java
package com.charles;

public class Revision {
    public static void main(String[] args) {
        int[][] integers = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(integers[i][j] + " ");

            System.out.println();
        }
    }
}

Process finished with exit code 0
*/
