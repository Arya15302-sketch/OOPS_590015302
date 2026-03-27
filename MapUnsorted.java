package collections;

import java.util.*;

public class MapUnsorted {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // INSERT
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        System.out.println("After Insert: " + map);

        // DELETE
        map.remove(2);
        System.out.println("After Delete: " + map);

        // TRAVERSE
        System.out.println("Traverse:");
        map.forEach((k, v) -> System.out.println(k + " " + v));

        // UPDATE
        map.replace(1, "Updated A");
        System.out.println("After Update: " + map);
    }
}