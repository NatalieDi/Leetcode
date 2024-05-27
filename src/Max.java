import java.util.*;
public class Max {

    public static int sequence(int[] arr) {
        int max = 0;
        int sum;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i];
            if (sum > max) max = sum;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) max = sum;

            }
        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(sequence(new int[]{}));
    }
}
