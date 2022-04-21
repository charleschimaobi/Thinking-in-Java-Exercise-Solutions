//Exercise 14 of chapter 3, topic: Operators


public class Method {
    public static void main (String [] args) {
        compare("Charles", "Chimaobi");
        compare("Charles", "Onah");
        compare("Onah", "Onah");
        compare("Charles", "Chimaobi");

    }

public static void compare(String name1, String name2){
    System.out.println(name1 == name2);
    System.out.println(name1 != name2);
}
}
// Output:
//false
//true
//false
//true
//true
//false
//false
//true