import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    public static String removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                k += 1;
            }
        }
        int l = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length - i > 1 && nums[i] != nums[i + 1]) {
                nums[l] = nums[i + 1];
                l++;
            }
            if (i >= k) {
                nums[i] = 0;
            }
        }
        return k + " " + Arrays.toString(nums);
    }
}

