
/** Given a string s, reverse only all the vowels in the string and return it.

 *  *The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 *  *Example 1:
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 * Explanation:
 * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

 *  *Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede" */

class Solution {

    public String reverseVowels(String s) {
        String vow = "";
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vow += c;
            }
        }
        vow = reverse(vow);
        String res = "";
        int index = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                res += vow.charAt(index++);
            } else {
                res += c;
            }
        }
        return res;
    }

    private boolean isVowel(char c) {
        boolean a = false;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            a = true;
        }
        return a;
    }

    public String reverse(String input) {
        if (input == null) {
            return input;
        }
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }
}
