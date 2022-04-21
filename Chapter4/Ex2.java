//Exercise 2 of chapter 4
import java.util.Random;
public class Ex2 {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random(); 
    
        for(int i = 1; i <= 25; i++){
            int number1 = rand1.nextInt(25);
            int number2 = rand2.nextInt(25);
            if(number1 > number2){
                System.out.println(number1 + " is greater than " + number2 );
            }
            else if(number1 < number2){
                System.out.println(number1 + " is less than " + number2 );
            }
            else{
                System.out.println(number1 + " is equal to "+ number2 );
            }

        }
    }
} 
//Output:
//24 is greater than 12
// 8 is less than 24
// 0 is less than 3
// 11 is less than 12
// 22 is greater than 5
// 22 is equal to 22
// 20 is less than 22
// 7 is greater than 4
// 13 is less than 20
// 15 is greater than 3
// 22 is greater than 12
// 11 is less than 16
// 4 is less than 9
// 24 is greater than 12
// 11 is greater than 7
// 8 is less than 19
// 13 is less than 16
// 15 is greater than 14
// 8 is greater than 3
// 22 is greater than 15
// 21 is greater than 2
// 12 is less than 20
// 23 is greater than 12
// 16 is greater than 4
// 0 is less than 14
// PS C:\Users\User\Exercise\Exercises\Chapter4>           
            


