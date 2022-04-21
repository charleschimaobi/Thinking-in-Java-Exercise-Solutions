// Exercise 30: Modify Human.java so that the exceptions inherit from 
// RuntimeException. Modify main( ) so that the technique in TurnOffChecking.java is 
// used to handle the different types of exceptions. 

package Chapter12;
class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

class WrapCheckedExceptions {
	void throwRuntimeException(int type) {
		try {
			switch(type) {
			case(0): throw new Annoyance();
			case(1): throw new Sneeze();
			case(2): throw new RuntimeException("Case(2) RuntimeException thrown:");
			default: return;
			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}

public class Ex30 {
    class Human {
        public static void main(String[] args) {
            WrapCheckedExceptions wce = new WrapCheckedExceptions();
            for(int i = 0; i < 3; i++)  
                try {
                    if(i < 3)
                        wce.throwRuntimeException(i);
                    else
                        throw new RuntimeException();
                }catch(RuntimeException re) {
                    try {
                        throw re.getCause();
                    } catch(Sneeze e) {
                        System.out.println("Sneeze: " + e);
                    } catch(Annoyance e) {
                        System.out.println("Annoyance: " + e);
                    } catch(Throwable e) {
                        System.out.println("Throwable: " + e);
                    }
                }
        }
      }
}
// Output:
// Annoyance: Chapter12.Annoyance
// Sneeze: Chapter12.Sneeze
// Throwable: java.lang.RuntimeException: Case(2) RuntimeException thrown: