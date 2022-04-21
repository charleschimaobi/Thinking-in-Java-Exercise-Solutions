/*
Exercise 40: (3) Add a speak( ) method to all the pets in typeinfo.pets. Modify
Apply.java to call the speak( ) method for a heterogeneous collection of Pet.
 */
package Chapter15;

import typeinfo.pets.*;

import java.lang.reflect.*;
import java.util.*;


class Apply {
    public static <T, S extends Iterable<? extends T>>
    void apply(S seq, Method f, Object... args) {
        try {
            for(T t: seq)
                f.invoke(t, args);
        } catch(Exception e) {
            // Failures are programmer errors
            throw new RuntimeException(e);
        }
    }
}

class Shape {
    public void rotate() {
        System.out.println(this + " rotate"); }
    public void resize(int newSize) {
        System.out.println(this + " resize " + newSize);
    }
}

class Square extends Shape {}

class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size) {
        try {
            for(int i = 0; i < size; i++)
                // Assumes default constructor:
                add(type.newInstance());
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
public class Ex40 {
    public static void main(String[] args) throws Exception {
        System.out.println("Using ArrayList:");
        List<Pet> pets = Pets.arrayList(10);
        System.out.println("pets: " + pets);
        Apply.apply(pets, Cat.class.getMethod("Speak"));
        System.out.println("\nUsing Filledlist (only one type):");
        Apply.apply((new FilledList<>(Cat.class, 10)), Cat.class.getMethod("Speak"));

        }
    }
