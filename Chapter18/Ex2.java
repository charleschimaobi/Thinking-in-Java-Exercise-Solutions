/*
Exercise 2: (2) Create a class called SortedDirList with a constructor that takes a File
object and builds a sorted directory list from the files at that File. Add to this class two
overloaded list( ) methods: the first produces the whole list, and the second produces the
subset of the list that matches its argument (which is a regular expression).
 */

package Chapter18;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

import static com.charles.Main.print;

class SortedDirList {
    private String[] list;

    SortedDirList(File path) {
        this.list = path.list();
        Arrays.sort(this.list, String.CASE_INSENSITIVE_ORDER);
    }

    public String[] list() {
        return list;
    }

    public String[] list(String regex) {
        List<String> matchedFiles = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        for (String s : list) {
            if (p.matcher(s).matches()) {
                matchedFiles.add(s);
            }
        }
        return matchedFiles.toArray(new String[matchedFiles.size()]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }

}

public class Ex2 {
    public static void main(String[] args) {
        print("sorted directory list from the file:");
        SortedDirList sortedDirList = new SortedDirList(new File("src/Chapter18"));
        System.out.println(sortedDirList);

        print("producing the whole list:");
        for (String s : sortedDirList.list()) {
            System.out.println(s);
        }
        System.out.println();

        print("producing the subset of the list that matches with 'Ex' argument:");
        for (String s : sortedDirList.list("Ex.*")) {
            System.out.println(s);
        }

    }
}
/* Output:
sorted directory list from the file:
DirList2.java
DirList3.java
Ex1.java
Ex2.java

producing the whole list:
DirList2.java
DirList3.java
Ex1.java
Ex2.java

producing the subset of the list that matches with 'Ex' argument:
Ex1.java
Ex2.java

Process finished with exit code 0
*/