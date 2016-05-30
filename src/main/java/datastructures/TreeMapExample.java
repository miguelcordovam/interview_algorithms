package datastructures;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        final Map<Integer, String> counts = new TreeMap<>();
        counts.put(4, "four");
        counts.put(1, "one");
        counts.put(3, "three");
        counts.put(2, "two");
        counts.put(5, "five");
        counts.put(0, "zero");

        counts.keySet().forEach(s -> System.out.println(counts.get(s)));
    }

}
