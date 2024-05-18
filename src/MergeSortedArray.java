import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println(merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3));
    }

    public static String merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = (n + m) - 1;

        while (index >= 0 && j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;

            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
        return Arrays.toString(nums1);


    }
}

