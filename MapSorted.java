package collections;

import java.util.*;

public class MapSorted {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // INSERT
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        System.out.println("After Insert (Sorted): " + map);

        // DELETE
        map.remove(2);
        System.out.println("After Delete: " + map);

        // TRAVERSE
        System.out.println("Traverse:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // UPDATE
        map.put(1, "Updated A");
        System.out.println("After Update: " + map);
    }
}