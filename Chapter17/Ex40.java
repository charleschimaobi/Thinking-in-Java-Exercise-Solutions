/*
Exercise 40: (5) Create a class containing two String objects and make it Comparable
so that the comparison only cares about the first String. Fill an array and an ArrayList with
objects of your class, using the RandomGenerator generator. Demonstrate that sorting
works properly. Now make a Comparator that only cares about the second String, and
demonstrate that sorting works properly. Also perform a binary search using your
Comparator
 */
package Chapter17;
import java.util.*;
import mindview.RandomGenerator;

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
public class Ex40 {
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
        ArrayList<TwoString> list = new ArrayList<>(15);
        for (int i = 0; i < array.length; i++) {
            String a = random.next();
            String b = random.next();
            array[i] = new TwoString(a, b);
            list.add(new TwoString(a, b));
        }
        System.out.println("----- Constructor Referring to first string -----");
        System.out.println("Before Sorting:(ArrayList) " + list);
        Collections.sort(list);
        System.out.println("After Sorting:(ArrayList) " + list);
        System.out.print("Before Sorting:(array) ");
        printArray(array);
        System.out.print("After Sorting:(array) ");
        Arrays.sort(array);
        printArray(array);
        System.out.println("------Constructor Referring to second string-----");
        System.out.println("Before Sorting:(ArrayList) " + list);
        Collections.sort(list, new TwoString.TwoStringComparator());
        System.out.println("After Sorting:(ArrayList) " + list);
        System.out.print("Before Sorting:(array) ");
        printArray(array);
        Arrays.sort(array, new TwoString.TwoStringComparator());
        System.out.print("After Sorting:(array) ");
        printArray(array);
        System.out.println("------Binary search-----");
        int i = Collections.binarySearch(list, list.get(1), new TwoString.TwoStringComparator());
        System.out.println("[--Target---vs---Origin--]");
        System.out.println(list.get(i) + " vs " + list.get(1));
    }
}
/*
----- Constructor Referring to first string -----
Before Sorting:(ArrayList) [(YNzb,rnyG), (cFOW,ZnTc), (QrGs,eGZM), (mJMR,oEsu), (EcUO,neOE), (dLsm,wHLG), (EahK,cxrE), (qUCB,bkIn), (aMes,btWH), (kjUr,UkZP)]
After Sorting:(ArrayList) [(EahK,cxrE), (EcUO,neOE), (QrGs,eGZM), (YNzb,rnyG), (aMes,btWH), (cFOW,ZnTc), (dLsm,wHLG), (kjUr,UkZP), (mJMR,oEsu), (qUCB,bkIn)]
Before Sorting:(array) [(YNzb,rnyG), (cFOW,ZnTc), (QrGs,eGZM), (mJMR,oEsu), (EcUO,neOE), (dLsm,wHLG), (EahK,cxrE), (qUCB,bkIn), (aMes,btWH), (kjUr,UkZP)]
After Sorting:(array) [(EahK,cxrE), (EcUO,neOE), (QrGs,eGZM), (YNzb,rnyG), (aMes,btWH), (cFOW,ZnTc), (dLsm,wHLG), (kjUr,UkZP), (mJMR,oEsu), (qUCB,bkIn)]
------Constructor Referring to second string-----
Before Sorting:(ArrayList) [(EahK,cxrE), (EcUO,neOE), (QrGs,eGZM), (YNzb,rnyG), (aMes,btWH), (cFOW,ZnTc), (dLsm,wHLG), (kjUr,UkZP), (mJMR,oEsu), (qUCB,bkIn)]
After Sorting:(ArrayList) [(kjUr,UkZP), (cFOW,ZnTc), (qUCB,bkIn), (aMes,btWH), (EahK,cxrE), (QrGs,eGZM), (EcUO,neOE), (mJMR,oEsu), (YNzb,rnyG), (dLsm,wHLG)]
Before Sorting:(array) [(EahK,cxrE), (EcUO,neOE), (QrGs,eGZM), (YNzb,rnyG), (aMes,btWH), (cFOW,ZnTc), (dLsm,wHLG), (kjUr,UkZP), (mJMR,oEsu), (qUCB,bkIn)]
After Sorting:(array) [(kjUr,UkZP), (cFOW,ZnTc), (qUCB,bkIn), (aMes,btWH), (EahK,cxrE), (QrGs,eGZM), (EcUO,neOE), (mJMR,oEsu), (YNzb,rnyG), (dLsm,wHLG)]
------Binary search-----
[--Target---vs---Origin--]
(cFOW,ZnTc) vs (cFOW,ZnTc)

Process finished with exit code 0

 */

