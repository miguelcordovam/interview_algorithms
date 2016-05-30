package sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertSort {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 0, 2, -5, -8, 10, 12, 1);

        insertSort(numbers).forEach(System.out::println);
    }

    private static List<Integer> insertSort(final List<Integer> numbers) {
        final List<Integer> sortedList = new LinkedList<>();

        originalList:
        for (Integer number: numbers) {
            for (int i = 0; i < sortedList.size() ; i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }

            sortedList.add(sortedList.size(), number);
        }

        return sortedList;

    }

}
