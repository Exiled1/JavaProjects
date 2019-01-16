import java.util.Arrays;

public class TestStuff {
    public static int[] multiplesOf(int number, int count) {
        int[] arr = new int[count];
        arr[0] = number;
        if (arr.length < 2) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] = number + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        String arr = Arrays.toString(multiplesOf(5, 3));
        System.out.println(arr);
    }
}
