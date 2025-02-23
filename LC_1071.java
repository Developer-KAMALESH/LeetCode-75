
/** For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 *
 *  *Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 *  *Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 *
 *  *Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 *
 *  *Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 *
 *  *Constraints:
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */
class LC_1071 {

    public String_Problems gcdOfStrings(String_Problems str1, String_Problems str2) {
        String_Problems result = "";
        if (!(str1 + str2).equals(str2 + str1)) {
            return result;
        } else {
            int len = gcd(str1.length(), str2.length());
            result = str1.substring(0, len);
            return result;
        }
    }

    public static int gcd(int a, int b) {
        int res = b == 0 ? a : gcd(b, a % b);
        return res;
    }
}
