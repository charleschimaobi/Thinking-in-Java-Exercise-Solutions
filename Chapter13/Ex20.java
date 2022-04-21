/*
Exercise 20: (2) Create a class that contains int, long, float and double and String
fields. Create a constructor for this class that takes a single String argument, and scans that
string into the various fields. Add a toString( ) method and demonstrate that your class
works correctly.
 */
package Chapter13;

import java.util.*;

import static com.charles.Main.print;

class Ex20Class {
     int i;
     long l;
     float f;
     double d;
     String s;
    Ex20Class(String str) {
        Scanner scan = new Scanner(str);
        i = scan.nextInt();
        l = scan.nextLong();
        f = scan.nextFloat();
        d = scan.nextDouble();
        this.s = scan.next();
    }
    public String toString() {
        return
                "Int: "     + i + "\n" +
                "Long: "    + l + "\n" +
                "Float: "   + f + "\n" +
                "Double: "  + d + "\n" +
                "String: "  + s;
    }
}
public class Ex20 {
    public static void main(String[] args) {
        Ex20Class c = new Ex20Class("10 32000 4.618 111.73 String");
        print(c.toString());
    }
}
/* Output:
Int: 10
Long: 32000
Float: 4.618
Double: 111.73
String: String

Process finished with exit code 0

 */