// Exercise 9: A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 
// 34, and so on, where each number (from the third on) is the sum of the previous two. Create 
// a method that takes an integer as an argument and displays that many Fibonacci numbers 
// starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the 
// name of the class) the output will be: 1, 1, 2, 3, 5.

package Chapter4;

public class Fibocanni {
    static int n1 = 1;
    static int n2 = 1;
    static int sum;
    public static void main(String[] args) {
        onah(5);
        
    }
    static void onah(int n){
        for(int i =0; i < n; i++){
            if(i <= 1){
                System.out.print("1, ");
            }
            else if(i>=2){
                sum = n1 + n2;
                System.out.print(sum);
                System.out.print(", ");
                n1 = n2;
                n2 = sum;


            }
        }
        System.out.println();
    } 
}
// Output:
// 1, 1, 2, 3, 5,