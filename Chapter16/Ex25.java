// Exercise 25: (3) Rewrite PythonLists.py in Java.
package Chapter16;
import java.util.*;

class MyList<T> extends ArrayList<T> {
    List<T> myList = new ArrayList<T>();
    MyList(List<T> list) { myList = list; }
    public MyList<T> getReversed() {
        ListIterator<T> iterator = myList.listIterator(myList.size());
        List<T> reverseList = new ArrayList<>();
        while(iterator.hasPrevious())
            reverseList.add(iterator.previous());
        return new MyList<>(reverseList);
    }
}
public class Ex25 {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(aList.getClass().getSimpleName());
        System.out.println(aList);
        System.out.println(aList.get(4));
        aList.add(6);
        aList.addAll(new ArrayList<>(Arrays.asList(7,8)));
        List<Integer> aSlice = aList.subList(2,4);
        System.out.println(aSlice);
        MyList<Integer> list2 = new MyList<>(aList);
        System.out.println(list2.getReversed().myList);
    }
}
/*
ArrayList
[1, 2, 3, 4, 5]
5
[3, 4]
[8, 7, 6, 5, 4, 3, 2, 1]

Process finished with exit code 0

 */
