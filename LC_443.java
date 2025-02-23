
import java.util.Arrays;

/**
 * Given an array of characters chars, compress it using the following
 * algorithm:
 *
 *  *Begin with an empty string s. For each group of consecutive repeating
 * characters in chars:
 *
 *  *If the group's length is 1, append the character to s. Otherwise, append
 * the character followed by the group's length. The compressed string s should
 * not be returned separately, but instead, be stored in the input character
 * array chars. Note that group lengths that are 10 or longer will be split into
 * multiple characters in chars.
 *
 *  *After you are done modifying the input array, return the new length of the
 * array. You must write an algorithm that uses only constant extra space.
 *
 *  *Example 1: Input: chars = ["a","a","b","b","c","c","c"] Output: Return 6,
 * and the first 6 characters of the input array should be:
 * ["a","2","b","2","c","3"] Explanation: The groups are "aa", "bb", and "ccc".
 * This compresses to "a2b2c3".
 *
 *  *Example 2: Input: chars = ["a"] Output: Return 1, and the first character
 * of the input array should be: ["a"] Explanation: The only group is "a", which
 * remains uncompressed since it's a single character.
 *
 *  *Example 3: Input: chars =
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"] Output: Return 4, and
 * the first 4 characters of the input array should be: ["a","b","1","2"].
 * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to
 * "ab12".
 */
public class LC_443 {

    //This logic is shared by https://github.com/asmath-akbar-ali/
    public int compress1(char[] chars) {
        StringBuilder list = new StringBuilder();
        char a = chars[0];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == a) {
                count++;
            } else if (chars[i] != a) {
                list.append(Character.toString(chars[i - 1]));
                if (count > 1) {
                    list.append(Integer.toString(count));
                }
                a = chars[i];
                count = 1;
            }
            if (i == chars.length - 1) {
                list.append(Character.toString(chars[i]));
                if (count > 1) {
                    list.append(Integer.toString(count));
                }
            }
        }
        for (int i = 0; i < list.length(); i++) {
            chars[i] = list.charAt(i);
        }
        return list.length();
    }

    //This is my logic, but its incomplete!
    public int compress2(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        char temp = chars[0];
        int[] nums = new int[chars.length];
        char[] cha = new char[chars.length];
        int count = 0, ind = 0, indx = 1;
        cha[0] = chars[0];
        for (char a : chars) {
            if (temp == a) {
                count++;
            } else {
                nums[ind++] = count;
                cha[indx++] = a;
                temp = a;
                count = 1;
            }
        }
        nums[ind] = count;
        int charCount = 0, numCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                numCount += String.valueOf(nums[i]).length();
            }
            if (cha[i] != 0) {
                charCount++;
            }
        }
        char[] num = new char[numCount];
        char[] ch = new char[charCount];
        int numIndex = 0, chIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (char c : String.valueOf(nums[i]).toCharArray()) {
                    num[numIndex++] = c;
                }
            }
            if (cha[i] != 0) {
                ch[chIndex++] = cha[i];
            }
        }
        int size = numIndex + chIndex, id1 = 0, id2 = 0;
        char[] res = new char[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                res[i] = num[id1++];
            } else {
                res[i] = ch[id2++];
            }
        }
        for (int i = 0; i < size; i++) {
            chars[i] = res[i];
        }
        System.out.println(Arrays.toString(res));
        return size;
    }
}
