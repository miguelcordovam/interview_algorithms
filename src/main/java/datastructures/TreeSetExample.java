package datastructures;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();
        names.add("Miguel");
        names.add("Ana");
        names.add("Cristina");
        names.add("Maria");
        names.add("Rita");
        names.add("Miguel");

        names.forEach(System.out::println);

    }

}
