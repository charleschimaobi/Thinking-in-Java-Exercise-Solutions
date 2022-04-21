// Exercise 19: Create a framework using Factory Methods that performs both coin 
// tossing and dice tossing. 

package Chapter9;

import java.util.Random;

interface Tosser {
	public void tossing();
}

interface TosserFactory {
	public Tosser getTosser();
}

class CoinTosser implements Tosser {

	public CoinTosser() {}

	public void tossing() {
		Random rand = new Random();
		if ((rand.nextInt(2) % 2) == 0) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
	}

}

class CoinTosserFactory implements TosserFactory {
	public Tosser getTosser() {
		return new CoinTosser();
	}
}

class DiceTosser implements Tosser {

	public DiceTosser() {}

	public void tossing() {
		Random rand = new Random();
		System.out.println(rand.nextInt(6)+1);
	}

}

class DiceTosserFactory implements TosserFactory {
	public Tosser getTosser() {
		return new DiceTosser();
	}
}
public class Ex19 {
    public void Toss(TosserFactory fact) {
		fact.getTosser().tossing();
	}

	public static void main(String[] args){
		
        Ex19 c = new Ex19();
		
        c.Toss(new DiceTosserFactory());
		c.Toss(new CoinTosserFactory());
}
} 
// Output of a toss:
// 3
// Tails