/*
Exercise 1: Create a new class called Gerbil with an int gerbilNumber that’s 
initialized in the constructor. Give it a method called hop( ) that displays which gerbil 
number this is, and that it’s hopping. Create an ArrayList and add Gerbil objects to the 
List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil. 
*///

package Chapter11;
import java.util.*;
class Gerbil {

	int gerbilNumber;

	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	public void hop() {
		System.out.println(gerbilNumber);
	}
}
public class Ex1 {
    public static void main(String[] args){
		ArrayList<Gerbil> list = new ArrayList<Gerbil>();
		for (int i = 0; i < 5; i++) 
			list.add(new Gerbil(i));
		for (int i = 0; i< list.size(); i++) 
			list.get(i).hop();
		for (Gerbil g: list) {
			g.hop();				
		}			
	}	
}
// Output:
// 0
// 1
// 2
// 3
// 4
// 0
// 1
// 2
// 3
// 4