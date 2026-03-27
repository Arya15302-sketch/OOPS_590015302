package collections;

import java.util.*;

public class SetSorted {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // INSERT
        Collections.addAll(set, 30, 10, 20);
        System.out.println("After Insert (Sorted): " + set);

        // DELETE
        set.remove(10);
        System.out.println("After Delete: " + set);

        // TRAVERSE
        System.out.println("Traverse:");
        set.forEach(System.out::println);

        // UPDATE
        set.remove(20);
        set.add(100);
        System.out.println("After Update: " + set);
    }
}