// Exercise 1: Create a class containing an int and a char that are not initialized, and 
// print their values to verify that Java performs default initialization.

public class Ex1 {
    int x;
    char c;
    public static void main(String args[])
    {
        Ex1 ans = new Ex1();
        System.out.println(ans.x);
        System.out.println(ans.c);
    }

    
}
// Output:
// 0
//