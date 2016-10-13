package questions;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumLeftRight {
    //Write a function that traverses an array and checks the sum to the left of the index with the sum to the
    //right  of the index, and returns the index position when the left summation equals the right.
    // Can you optimize your solution further?

    public static void main(String[] args) {
        int[] numbers = {10, 4, 5, 1, 20, 40, 1};

        System.out.println(getIndex(numbers));
//        System.out.println(getIndexOptimized(numbers));
    }


    private static int getIndex(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Iteration: " + i);
            int sumLeft = sum(Arrays.copyOfRange(numbers, 0, i));
            int sumRight = sum(Arrays.copyOfRange(numbers, i, numbers.length));

            if (sumLeft == sumRight) {
                return i;
            }
        }

        return -1;
    }


    private static int getIndexOptimized(int[] numbers) {

        int index = (int) (numbers.length / 2);

        int sumLeft = sum(Arrays.copyOfRange(numbers, 0, index));
        int sumRight = sum(Arrays.copyOfRange(numbers, index, numbers.length));

        if (sumLeft == sumRight) {
            return index;
        } else if (sumLeft < sumRight) {
            while (sumLeft != sumRight && index < numbers.length) {
                System.out.println("Iteration");
                sumLeft += numbers[index];
                index++;
            }
        } else {
            while (sumLeft != sumRight && index >= 0) {
                System.out.println("Iteration");
                sumLeft -= numbers[index];
                index--;
            }
        }

        return index;
    }


    private static int sum(int[] numbers) {
        return Arrays.stream(numbers).reduce(0, Integer::sum);
    }

}
