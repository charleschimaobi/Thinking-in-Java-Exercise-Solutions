//Exercise 8 0f chapter 4--when the break has been removed
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you grade here: ");
        String grade = scan.next().toUpperCase();
        for(int i = 0; i < 1; i++){
            switch(grade){
                case "A":
                System.out.println("You made an excellent grade");
                break;
                case "B":
                System.out.println("You made a very goog grade");
                break;
                case "C":
                System.out.println("You made a credit");
                break;
                case "D":
                System.out.println("You made a fair pass");
                break;
                case "E":
                System.out.println("You just passed the course");
                break;
                case "F":
                System.out.println("Sorry, you failed the course");
                break;
                default: 
                System.out.println("Please, put appropriate grade value");


        }
}

}
}
// Output when each case has a "break":
// Enter you grade here: a
// You made an excellent grade