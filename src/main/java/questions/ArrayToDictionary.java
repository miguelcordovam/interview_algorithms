package questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToDictionary {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 6, 7};

        Map<Integer, Integer> dictionary = new TreeMap<>();

        for (int i = 0; i < array.length; i++) {

            if (dictionary.containsKey(array[i])) {
                dictionary.put(array[i], dictionary.get(array[i]) + 1);
            } else {
                dictionary.put(array[i], 1);
            }
        }

        //using java 8

        List<Integer> numbers = Arrays.stream(array).boxed().collect(Collectors.toList());

        Map<Integer, Long> dictionaryJava8 = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(dictionary);
        System.out.println(dictionaryJava8);

    }
}
