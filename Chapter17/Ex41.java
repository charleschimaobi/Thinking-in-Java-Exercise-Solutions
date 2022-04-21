/*
Exercise 41: (3) Modify the class in the previous exercise so that it will work with
HashSets and as a key in HashMaps.
 */
package Chapter17;
import java.util.*;
import mindview.RandomGenerator;

class TwoStrings implements Comparable<TwoStrings> {
    private String first;
    private String second;

    public TwoStrings(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public int compareTo(TwoStrings other) {
        return first.compareTo(other.first);
    }

    public String toString() {
        return "(" + first + "," + second + ")";
    }
    public static class TwoStringsComparator implements Comparator<TwoStrings> {
        public int compare(TwoStrings one, TwoStrings two) {
            return one.second.compareTo(two.second);
        }
    }
}
public class Ex41 {
    public static void main(String[] args) {
        RandomGenerator.String rand = new RandomGenerator.String(4);
        HashSet<TwoStrings> set = new HashSet<>();
        HashMap<TwoStrings, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String a = rand.next();
            String b = rand.next();
            set.add(new TwoStrings(a, b));
            map.put(new TwoStrings(a, b), i);
        }
        System.out.println("HashSet: " + set);
        System.out.println("HashMap: " + map);

    }
}
/*
HashSet: [(EcUO,neOE), (mJMR,oEsu), (aMes,btWH), (qUCB,bkIn), (EahK,cxrE), (dLsm,wHLG), (QrGs,eGZM), (kjUr,UkZP), (YNzb,rnyG), (cFOW,ZnTc)]
HashMap: {(dLsm,wHLG)=5, (mJMR,oEsu)=3, (YNzb,rnyG)=0, (cFOW,ZnTc)=1, (QrGs,eGZM)=2, (EcUO,neOE)=4, (EahK,cxrE)=6, (aMes,btWH)=8, (qUCB,bkIn)=7, (kjUr,UkZP)=9}

Process finished with exit code 0

 */
