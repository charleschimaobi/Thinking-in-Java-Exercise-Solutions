/*

 */
package Chapter15;
import typeinfo.pets.*;
import java.util.*;

import static typeinfo.pets.Pets.randomPet;

interface Addable<T> { void add(T t); }
class Fill2 {
    // Classtoken version:
    public static <T> void fill(Addable<T> addable,
                                Class<? extends T> classToken, int size) {
        for(int i = 0; i < size; i++)
            try {
                addable.add(classToken.newInstance());
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
    }
    // Generator version:
    public static <T> Pet[] fill(Addable<T> addable,
                                PetCreator<T> generator, int size) {
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }
}
// To adapt a base type, you must use composition.
// Make any Collection Addable using composition:
class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }
    public void add(T item) { c.add(item); }
}

// A Helper to capture the type automatically:
class Adapter {
    public static <T>
    Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<T>(c);
    }
}
// To adapt a specific type, you can use inheritance.
// Make a SimpleQueue Addable using inheritance:
class AddableSimpleQueue<T>
        extends SimpleQueue<T> implements Addable<T> {
    public void add(T item) { super.add(item); }
}
public class Ex41 {
    public static void main(String[] args) {
        // Adapt a Collection:
        List<Pet> carrier = new ArrayList<Pet>();
        Fill2.fill(
                new AddableCollectionAdapter<Pet>(carrier),
                Pet.class, 3);
        // Helper method captures the type:
        Fill2.fill(Adapter.collectionAdapter(carrier),
                Cat.class, 2);
        for(Pet c: carrier)
            System.out.println(c);
        System.out.println("----------------------");
        // Use an adapted class:
        AddableSimpleQueue<Pet> coffeeQueue =
                new AddableSimpleQueue<Pet>();
        Fill2.fill(coffeeQueue, Dog.class, 4);
        Fill2.fill(coffeeQueue, Rodent.class, 1);
        for(Pet c: coffeeQueue)
            System.out.println(c);
    }
}
/*
Pet
Pet
Pet
Cat
Cat
----------------------
Dog
Dog
Dog
Dog
Rodent

Process finished with exit code 0

 */