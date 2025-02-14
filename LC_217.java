
/** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 *  *Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 *  *Explanation:
 * The element 1 occurs at the indices 0 and 3.
 *
 *  *Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 *  *Explanation:
 * All elements are distinct.
 *
 *  *Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 *
 *  *Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
//This approach passed 70/76 Test cases
class Solution {

    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    break;
                }
            }
            if (count != 1) {
                result = true;
                return result;
            }
        }
        return result;
    }
}

//This approach passed all the 76 Test cases


import java.util.Arrays;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
