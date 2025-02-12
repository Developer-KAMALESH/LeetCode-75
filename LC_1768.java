
class LC_1768 {

    public static void main(String[] srgs) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(Solution(word1,word2));
        }
        public static String Solution(String word1, String word2){
        int len1 = word1.length(), len2 = word2.length();
        String result = "";
        int i = 0, j = 0;

        while (i < len1 || j < len2) {
            if (i < len1) {
                result+=word1.charAt(i++);
            }
            if (j < len2) {
                result+=word2.charAt(j++);
            }
        }
        return result;
    }
}
