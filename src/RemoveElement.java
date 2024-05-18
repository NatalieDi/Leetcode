import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2,3,3,2}, 3));
    }

    public static String removeElement(int[] nums, int val) {
        int i = 0;
        for (int elem: nums){
            if (elem != val){
                nums[i] = elem;
                i++;
            }
        }
        return i + " " + Arrays.toString(nums);
    }
}

