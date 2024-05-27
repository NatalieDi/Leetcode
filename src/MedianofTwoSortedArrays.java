import java.util.Arrays;

/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/
public class MedianofTwoSortedArrays {
//    private static int point1 = 0;
//    private static int point2 = 0;

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int len1 = nums1.length;
    int len2 = nums2.length;
    int first = 0, second = 0;
    int[] merge = new int[len1 + len2];
    int count = 0;
        while(first < len1 || second < len2){
        if(first < len1 && second < len2)
            merge[count++] = nums1[first] <= nums2[second] ? nums1[first++]: nums2[second++];
        else if(first < len1)
            merge[count++] = nums1[first++];
        else
            merge[count++] = nums2[second++];
    }
        return (len1 + len2) % 2 != 0 ?
            (double)merge[(len1 + len2) / 2] :
            ((double)merge[(len1 + len2) / 2] + (double)merge[(len1 + len2) / 2 - 1]) / 2;
}
}

//    // Get the smaller value between nums1[p1] and nums2[p2] and move the pointer forwards.
//
//    private static int getMin(int[] nums1, int[] nums2) {
//        if (point1 < nums1.length && point2 < nums2.length) {
//            return nums1[point1] < nums2[point2] ? nums1[point1++] : nums2[point2++];
//        } else if (point1 < nums1.length) {
//            return nums1[point1++];
//        } else if (point2 < nums2.length) {
//            return nums2[point2++];
//        }
//        return -1;
//    }
//
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if ((nums1.length + nums2.length) % 2 == 0) {
//            for (int i = 0; i < (nums1.length + nums2.length) / 2 - 1; i++) {
//                int tmp = getMin(nums1, nums2);
//            }
//            return (double) (getMin(nums1, nums2) + getMin(nums1, nums2)) / 2;
//        } else {
//            for (int i = 0; i < (nums1.length + nums2.length) / 2; i++) {
//                int tmp = getMin(nums1, nums2);
//            }
//            return getMin(nums1, nums2);
//        }
//    }
//}
