package collections;

import java.util.*;

public class SetUnsorted {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // INSERT
        Collections.addAll(set, 30, 10, 20);
        System.out.println("After Insert: " + set);

        // DELETE
        set.remove(10);
        System.out.println("After Delete: " + set);

        // TRAVERSE
        System.out.println("Traverse:");
        for (int i : set) {
            System.out.println(i);
        }

        // UPDATE (remove + add)
        set.remove(20);
        set.add(100);
        System.out.println("After Update: " + set);
    }
}