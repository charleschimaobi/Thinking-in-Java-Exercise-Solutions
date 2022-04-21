//Exercise 8 0f chapter 4--when the break has been removed
import java.util.Scanner;
public class Ex8b {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you grade here: ");
        String grade = scan.next().toUpperCase();
        for(int i = 0; i < 1; i++){
            switch(grade){
                case "A":
                System.out.println("You made an excellent grade");

                case "B":
                System.out.println("You made a very goog grade");
                
                case "C":
                System.out.println("You made a credit");
                
                case "D":
                System.out.println("You made a fair pass");
                
                case "E":
                System.out.println("You just passed the course");
                
                case "F":
                System.out.println("Sorry, you failed the course");
                
                default: 
                System.out.println("Please, put appropriate grade value");


        }
}
}
}
// Output when the break has been removed:
// You made an excellent grade
// You made a very goog grade
// You made a credit
// You made a fair pass
// You just passed the course
// Sorry, you failed the course
// Please, put appropriate grade value
