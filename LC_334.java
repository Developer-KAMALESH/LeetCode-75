
/** Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 *  *Example 1:
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.

 *  *Example 2:
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * Explanation: No triplet exists.

 *  *Example 3:
 * Input: nums = [2,1,5,0,4,6]
 * Output: true
 * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6. */
public class LC_334 {

    public boolean increasingTriplet(int[] nums) {
        int max = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        int size = nums.length;
        for (int num : nums) {
            if (num <= max) {
                max = num;
            } else if (num <= max2) {
                max2 = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
