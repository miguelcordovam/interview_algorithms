package datastructures;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();

        names.add("Miguel");
        names.add("Ana");
        names.add("Cristina");
        names.add("Maria");
        names.add("Rita");
        names.add("Miguel");

        names.forEach(System.out::println);

    }
}
