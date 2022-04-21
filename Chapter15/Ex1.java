/*
Exercise 1: (1) Use Holders with the typeinfo.pets library to show that a Holders
that is specified to hold a base type can also hold a derived type.
 */

package Chapter15;

import typeinfo.pets.*;

public class Ex1<T> {
    private T a;
    public Ex1(T a) {

        this.a = a;
    }
    public void set(T a) {

        this.a = a;
    }
    public T get() {

        return a;
    }
    public static void main(String[] args) {
        Ex1<Pet> ex1 =
                new Ex1<>(new Pet());

        Pet a = ex1.get(); // No cast needed
        System.out.println(a); // --> base class
        ex1.set(new Cat()); // --> derived class
        System.out.println(ex1.get());
    }
}
/* Output:
Pet
Cat

Process finished with exit code 0
*/
