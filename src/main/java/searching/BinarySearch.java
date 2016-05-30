package searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 50, 100, 500, 1000, 1500);

        System.out.println(binarySearch(numbers, 11));
        System.out.println(binarySearch(numbers, 14));
    }

    private static boolean binarySearch(final List<Integer> numbers, final int value) {

        if (numbers == null || numbers.isEmpty()){
            return false;
        }

        final int comparison = numbers.get(numbers.size() / 2);

        if (value == comparison) {
            return true;
        }

        if (value < comparison) {
            return binarySearch(numbers.subList(0, numbers.size() / 2), value);
        } else {
            return binarySearch(numbers.subList(numbers.size() / 2 + 1, numbers.size()), value);
        }
    }

}
