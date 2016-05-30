package datastructures;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        final Map<Integer, String> counts = new LinkedHashMap<>();
        counts.put(4, "four");
        counts.put(1, "one");
        counts.put(3, "three");
        counts.put(2, "two");
        counts.put(5, "five");
        counts.put(0, "zero");

        // iterating over the keys will be in the same order as insertion
        counts.keySet().forEach(s -> System.out.println(counts.get(s)));
    }
}
