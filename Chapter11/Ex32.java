/*
Exercise 32: (2) Following the example of MultilterableClass, add reversed( ) and
randomized( ) methods to NonCollectionSequence.java, as well as making
NonCollectionSequence implement Iterable, and show that all the approaches work in
foreach statements.
 */
package Chapter11;

import typeinfo.pets.*;
import java.util.*;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}
 class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
     public Iterator<Pet> iterator() {
         return new Iterator<Pet>() {
             private int current = 0;

             public boolean hasNext() {
                 return current < pets.length;
             }

             public Pet next() {
                 return pets[current++];
             }

             public void remove() { // Not implemented
                 throw new UnsupportedOperationException();
             }
         };
     }

     public Iterable<Pet> reversed() {
         return new Iterable<Pet>() {
             public Iterator<Pet> iterator() {
                 return new Iterator<Pet>() {
                     int current = pets.length - 1;

                     public boolean hasNext() {
                         return current > -1;
                     }

                     public Pet next() {
                         return pets[current--];
                     }

                     public void remove() { // Not implemented
                         throw new UnsupportedOperationException();
                     }
                 };
             }
         };
     }

     public Iterable<Pet> randomized() {
         return new Iterable<Pet>() {
             public Iterator<Pet> iterator() {
                 List<Pet> shuffled =
                         new ArrayList<Pet>(Arrays.asList(pets));
                 Collections.shuffle(shuffled, new Random(47));
                 return shuffled.iterator();
             }
         };
     }
 }
    public class Ex32 {
        public static void main(String[] args) {
            NonCollectionSequence ncs = new NonCollectionSequence();
            System.out.print("For Reversed: ");
            for (Pet p : ncs.reversed())
                System.out.print(p + " ");
            System.out.println();
            System.out.print("For Ramdomized: ");
            for (Pet p : ncs.randomized())
                System.out.print(p + " ");
            System.out.println();
            System.out.print("For Normal: ");
            for (Pet p : ncs)
                System.out.print(p + " ");
        }
    }

/*Output:
For Reversed: Manx Pug Cymric Pug Mutt Cymric Manx Rat
For Ramdomized: Pug Mutt Pug Rat Manx Manx Cymric Cymric
For Normal: Rat Manx Cymric Mutt Pug Cymric Pug Manx
Process finished with exit code 0
 */