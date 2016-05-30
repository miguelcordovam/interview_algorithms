package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {1, 0, -5, 10, 3, 20};
        bubbleSort(numbers);

        for (Integer i: numbers) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int [] numbers) {
        boolean numbersSwitched;

        do {
          numbersSwitched = false;
            for (int i = 0; i < numbers.length - 1 ; i++) {
                if (numbers[i+1] < numbers [i]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                    numbersSwitched = true;
                }
            }

        } while(numbersSwitched);

    }
}
