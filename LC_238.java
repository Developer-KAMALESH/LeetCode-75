
/** Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

 *  *The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 *  *You must write an algorithm that runs in O(n) time and without using the division operation.

 *  *Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]

 *  *Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0] */

public class LC_238 {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == 0) {
            answer = sumOfPro(nums, answer);
        } else if (zeroCount == 1) {
            answer = sumOfzero(nums, answer);
        } else if (zeroCount > 1) {
            return answer;
        }
        return answer;
    }

    public static int[] sumOfPro(int[] nums, int[] answer) {
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
        }
        System.out.println(prod);
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prod / nums[i];
        }
        return answer;
    }

    public static int[] sumOfzero(int[] nums, int[] answer) {
        int index = 0, pro = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                index = i;
            }
            pro = sum(nums);
        }
        answer[index] = pro;
        return answer;
    }

    public static int sum(int[] nums) {
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            prod *= nums[i];
        }
        return prod;
    }
}
