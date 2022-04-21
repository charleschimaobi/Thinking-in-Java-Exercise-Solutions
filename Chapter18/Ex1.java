/*
Exercise 1: (3) Modify DirList2.java (or one of its variants) so that the FilenameFilter
opens and reads each file (using the net.mindview.util.TextFile utility) and accepts the
file based on whether any of the trailing arguments on the command line exist in that file.
 */
package Chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;
import Textfile.TextFile;

class DirList {
    public static void main(String[] args) {
        File path = new File("src/Chapter18");
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }
    public boolean accept(File dir, String name) {
        if (new File(name).isDirectory()) {
            return false;
        } else {
            return pattern.matcher(TextFile.read(name)).find();
        }
    }
}
public class Ex1 {
    public static void main(String[] args){
        DirList2.main(args);
    }
}
/*
DirList2.java
DirList3.java
Ex1.java

Process finished with exit code 0

 */
