/*
Exercise 19: (8) Building on the previous two exercises, write a program that examines
Java source code and produces all the class names used in a particular program.
 */
package Chapter13;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.charles.Main.print;

public class Ex19 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        print("Enter the 'path' of the file you want to read: ");
        File file = new File(scan.next());
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            String[] str = scanner.nextLine().split(" ");
            System.out.println(str.getClass().getName());

            // for (String s : str)

        }
    }
}

/* Output:
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;
[Ljava.lang.String;

Process finished with exit code 0

 */

// However, i am still working on the program