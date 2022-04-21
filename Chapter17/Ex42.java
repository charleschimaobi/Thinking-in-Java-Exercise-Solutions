// Exercise 42: (2) Modify Exercise 40 so that an alphabetic sort is used.

package Chapter17;
import java.util.*;
import mindview.*;

class TwoString implements Comparable<TwoString> {
    private String first;
    private String second;

    public TwoString(String first, String second) {

        this.first = first;
        this.second = second;
    }

    public int compareTo(TwoString other) {
        return first.compareTo(other.first);
    }

    public String toString() {
        return "(" + first + "," + second + ")";
    }

    public static class TwoStringComparator implements Comparator<TwoString> {
        public int compare(TwoString one, TwoString two) {
            return one.second.compareTo(two.second);
        }
    }
}
public class Ex42 {
    public static void printArray(Object[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length -1] + "]");
    }

    public static void main(String[] args) {
        RandomGenerator.String random = new RandomGenerator.String(4);
        TwoString[] array = new TwoString[10];
        ArrayList<TwoString> arraylist = new ArrayList<>(15);
        for (int i = 0; i < array.length; i++) {
            String a = random.next();
            String b = random.next();
            array[i] = new TwoString(a, b);
            arraylist.add(new TwoString(a, b));
        }
        System.out.println("----- Constructor Referring to first string -----");
        System.out.println("Before Sorting:(ArrayList) " + arraylist);
        Collections.sort(arraylist);
        System.out.println("Using Alphabetic Sorting:(ArrayList) " + arraylist);
        System.out.print("Before Sorting:(array) ");
        printArray(array);
        System.out.print("Using Alphabetic Sorting:(array) ");
        Arrays.sort(array);
        printArray(array);
        System.out.println("------Constructor Referring to second string-----");
        System.out.println("Before Sorting:(ArrayList) " + arraylist);
        Collections.sort(arraylist, new TwoString.TwoStringComparator());
        System.out.println("Using Alphabetic Sorting:(ArrayList) " + arraylist);
        System.out.print("Before Sorting:(array) ");
        printArray(array);
        Arrays.sort(array, new TwoString.TwoStringComparator());
        System.out.print("Using Alphabetic Sorting:(array) ");
        printArray(array);
        System.out.println("------Binary search-----");
        int i = Collections.binarySearch(arraylist, arraylist.get(1), new TwoString.TwoStringComparator());
        System.out.println("[--Target---vs---Origin--]");
        System.out.println(arraylist.get(i) + " vs " + arraylist.get(1));

    }
}
/* Output:
----- Constructor Referring to first string -----
Before Sorting:(ArrayList) [(YNzb,rnyG), (cFOW,ZnTc), (QrGs,eGZM), (mJMR,oEsu), (EcUO,neOE), (dLsm,wHLG), (EahK,cxrE), (qUCB,bkIn), (aMes,btWH), (kjUr,UkZP)]
Using Alphabetic Sorting:(ArrayList) [(EahK,cxrE), (EcUO,neOE), (QrGs,eGZM), (YNzb,rnyG), (aMes,btWH), (cFOW,ZnTc), (dLsm,wHLG), (kjUr,UkZP), (mJMR,oEsu), (qUCB,bkIn)]
Before Sorting:(array) [(YNzb,rnyG), (cFOW,ZnTc), (QrGs,eGZM), (mJMR,oEsu), (EcUO,neOE), (dLsm,wHLG), (EahK,cxrE), (qUCB,bkIn), (aMes,btWH), (kjUr,UkZP)]
Using Alphabetic Sorting:(array) [(EahK,cxrE), (EcUO,neOE), (QrGs,eGZM), (YNzb,rnyG), (aMes,btWH), (cFOW,ZnTc), (dLsm,wHLG), (kjUr,UkZP), (mJMR,oEsu), (qUCB,bkIn)]
------Constructor Referring to second string-----
Before Sorting:(ArrayList) [(EahK,cxrE), (EcUO,neOE), (QrGs,eGZM), (YNzb,rnyG), (aMes,btWH), (cFOW,ZnTc), (dLsm,wHLG), (kjUr,UkZP), (mJMR,oEsu), (qUCB,bkIn)]
Using Alphabetic Sorting:(ArrayList) [(kjUr,UkZP), (cFOW,ZnTc), (qUCB,bkIn), (aMes,btWH), (EahK,cxrE), (QrGs,eGZM), (EcUO,neOE), (mJMR,oEsu), (YNzb,rnyG), (dLsm,wHLG)]
Before Sorting:(array) [(EahK,cxrE), (EcUO,neOE), (QrGs,eGZM), (YNzb,rnyG), (aMes,btWH), (cFOW,ZnTc), (dLsm,wHLG), (kjUr,UkZP), (mJMR,oEsu), (qUCB,bkIn)]
Using Alphabetic Sorting:(array) [(kjUr,UkZP), (cFOW,ZnTc), (qUCB,bkIn), (aMes,btWH), (EahK,cxrE), (QrGs,eGZM), (EcUO,neOE), (mJMR,oEsu), (YNzb,rnyG), (dLsm,wHLG)]
------Binary search-----
[--Target---vs---Origin--]
(cFOW,ZnTc) vs (cFOW,ZnTc)

Process finished with exit code 0

 */