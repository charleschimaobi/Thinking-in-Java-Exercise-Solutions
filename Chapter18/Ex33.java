/*
Exercise 33: (2) Write a program that displays the current value of a directory called
"base directory" and prompts you for a new value. Use the Preferences API to store the value.
 */
package Chapter18;

import java.util.*;
import java.util.prefs.*;
public class Ex33 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userNodeForPackage(Ex33.class);
        String directory = prefs.get("base directory", "Undefined");
        System.out.println("Base directory value: " + directory);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new directory value: ");
        directory = scanner.nextLine();
        prefs.put("base directory", directory);
        System.out.println("New directory value: " + directory);
    }
}
/* Output:
Base directory value: Undefined
Enter a new directory value: C:\Users\User\IdeaProjects\MyJavaProject\src\Chapter18\Ex1.java
New directory value: C:\Users\User\IdeaProjects\MyJavaProject\src\Chapter18\Ex1.java

Process finished with exit code 0

 */