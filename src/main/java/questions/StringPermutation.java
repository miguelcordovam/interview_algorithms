package questions;

public class StringPermutation {

    public static void main(String[] args) {

        permute("", "123");
    }

    private static void permute(String prefix, String word) {

        int n = word.length();

        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {

                permute(prefix + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }
    }
}
