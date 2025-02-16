
/**
 * 1. Basic String Operations (Similar to Length & Access in Arrays) 1. Find the
 * length of a string Input: "Hello" Output: 5 Input: "" (Empty String) Output:
 * 0 ________________________________________ 2. Access each character of a
 * string Input: "World" Output: nginx CopyEdit W o r l d Input: "Hi" Output:
 * css CopyEdit H i ________________________________________ 3. Print the string
 * as it is Input: "Java Programming" Output: Java Programming Input: " Space "
 * Output: Space (Prints with spaces intact)
 * ________________________________________ 2. Searching in Strings (Similar to
 * Searching in Arrays) 4. Check if a string contains a given substring Input:
 * "Coding is fun", "fun" Output: true Input: "LeetCode", "leet" Output: false
 * (Case-sensitive) ________________________________________ 5. Find the first
 * and last occurrence of a character Input: "banana", 'a' Output: First: 1,
 * Last: 5 Input: "apple", 'p' Output: First: 1, Last: 2
 * ________________________________________ 6. Check if a string starts with or
 * ends with a certain substring Input: "HelloWorld", "Hello" Output: true
 * Input: "OpenAI", "AI" Output: true ________________________________________
 * 3. Modification in Strings (Similar to Updating an Array Element) 7. Replace
 * all occurrences of a character or substring Input: "mississippi", "i", "o"
 * Output: "mossossoppo" Input: "hello world", " ", "-" Output: "hello-world"
 * ________________________________________ 8. Convert all characters to
 * uppercase/lowercase Input: "Hello" Output: "HELLO" Input: "JAVA" Output:
 * "java" ________________________________________ 9. Remove leading and
 * trailing spaces Input: " Trim me " Output: "Trim me" Input: " Test " Output:
 * "Test" ________________________________________ 10. Extract a part of a
 * string (Substring equivalent to subarray) Input: "substring", 3, 6 Output:
 * "str" Input: "Java", 1, 3 Output: "av"
 * ________________________________________ 4. String Splitting and Joining
 * (Similar to Splitting and Merging Arrays) 11. Split a string based on a space
 * or comma Input: "apple,banana,grape", "," Output: ["apple", "banana",
 * "grape"] Input: "one two three", " " Output: ["one", "two", "three"]
 * ________________________________________ 12. Join multiple strings into one
 * Input: ["one", "two", "three"], "-" Output: "one-two-three" Input: ["apple",
 * "banana"], ", " Output: "apple, banana"
 * ________________________________________ 5. String Reversal and Palindrome
 * Check (Similar to Array Reverse) 13. Reverse a string Input: "hello" Output:
 * "olleh" Input: "12345" Output: "54321"
 * ________________________________________ 14. Check if a string is a
 * palindrome Input: "racecar" Output: true Input: "hello" Output: false
 * ________________________________________ 6. Counting in Strings (Similar to
 * Counting in Arrays) 15. Count occurrences of a specific character Input:
 * "banana", 'a' Output: 3 Input: "apple", 'p' Output: 2
 * ________________________________________ 16. Count vowels and consonants in a
 * string Input: "hello" Output: Vowels: 2, Consonants: 3 Input: "ABCDE" Output:
 * Vowels: 2, Consonants: 3 ________________________________________ 7.
 * Conversions (Similar to Type Conversion in Arrays) 17. Convert a string to an
 * array of characters Input: "test" Output: ['t', 'e', 's', 't'] Input: "Java"
 * Output: ['J', 'a', 'v', 'a'] ________________________________________ 18.
 * Convert a character array back to a string Input: ['c', 'o', 'd', 'e']
 * Output: "code" Input: ['H', 'e', 'l', 'l', 'o'] Output: "Hello"
 * ________________________________________ 19. Convert a string to an integer
 * and vice versa Input: "123" Output: 123 (as an integer) Input: 456 (integer)
 * Output: "456" (as a string) 20. Find all occurrences of a character in a
 * string Input: "mississippi", 'i' Output: [1, 4, 7, 10] Input: "hello world",
 * 'o' Output: [4, 7] ________________________________________ 21. Find the
 * index of a substring Input: "programming", "gram" Output: 3 Input:
 * "datastructure", "data" Output: 0 ________________________________________
 * 22. Check if a string consists only of digits Input: "12345" Output: true
 * Input: "123a45" Output: false ________________________________________ 23.
 * Find the most frequently occurring character Input: "success" Output: 's'
 * (occurs 3 times) Input: "banana" Output: 'a' (occurs 3 times)
 * ________________________________________ 9. Advanced Modifications in Strings
 * 24. Remove all occurrences of a given character Input: "apple", 'p' Output:
 * "ale" Input: "mississippi", 's' Output: "miippi"
 * ________________________________________ 25. Capitalize the first letter of
 * each word Input: "hello world" Output: "Hello World" Input: "java
 * programming" Output: "Java Programming"
 * ________________________________________ 26. Toggle case of all characters
 * Input: "HeLLo" Output: "hEllO" Input: "JAVA" Output: "java"
 * ________________________________________ 27. Reverse words in a sentence
 * Input: "I love coding" Output: "coding love I" Input: "Java is fun" Output:
 * "fun is Java" ________________________________________ 28. Remove duplicate
 * characters from a string Input: "banana" Output: "ban" Input: "hello" Output:
 * "helo" ________________________________________ 10. Pattern-Based String
 * Operations 29. Check if two strings are anagrams Input: "listen", "silent"
 * Output: true Input: "triangle", "integral" Output: true
 * ________________________________________ 30. Count the number of words in a
 * string Input: "Hello world!" Output: 2 Input: "This is a test" Output: 4
 * ________________________________________ 31. Find the longest word in a
 * sentence Input: "The quick brown fox" Output: "quick" Input: "I love
 * programming" Output: "programming" ________________________________________
 * 32. Find the shortest word in a sentence Input: "Jump high and run" Output:
 * "run" Input: "Hello world" Output: "Hello"
 * ________________________________________ 33. Check if a string follows
 * camelCase Input: "camelCaseExample" Output: true Input: "PascalCase" Output:
 * false ________________________________________ 34. Count the occurrences of
 * each word in a string Input: "apple banana apple orange apple banana" Output:
 * makefile CopyEdit apple: 3 banana: 2 orange: 1 Input: "hello world hello"
 * Output: makefile CopyEdit hello: 2 world: 1
 * ________________________________________ 35. Find the longest common prefix
 * among a list of words Input: ["flower", "flow", "flight"] Output: "fl" Input:
 * ["dog", "racecar", "car"] Output: "" (No common prefix)
 * ________________________________________ 11. Encoding & Decoding Operations
 * 36. Encode a string by shifting characters Input: "abc", shift=1 Output:
 * "bcd" Input: "xyz", shift=2 Output: "zab"
 * ________________________________________ 37. Convert a string to ASCII values
 * Input: "ABC" Output: [65, 66, 67] Input: "hello" Output: [104, 101, 108, 108,
 * 111] ________________________________________ 38. Convert ASCII values to a
 * string Input: [72, 101, 108, 108, 111] Output: "Hello" Input: [74, 65, 86,
 * 65] Output: "JAVA" ________________________________________ 39. Remove
 * special characters from a string Input: "hello@world!" Output: "helloworld"
 * Input: "Java#123" Output: "Java123" ________________________________________
 * 40. Insert a character at a specific position Input: "hello", 'X', 2 Output:
 * "heXllo" Input: "java", 'P', 0 Output: "Pjava"
 * ________________________________________ 41. Remove a character at a specific
 * position Input: "hello", index=2 Output: "helo" Input: "java", index=1
 * Output: "jva" ________________________________________ 42. Find the first
 * non-repeating character Input: "swiss" Output: 'w' Input: "success" Output:
 * 'u' ________________________________________ 43. Find all substrings of a
 * given string Input: "abc" Output: arduino CopyEdit "a", "b", "c", "ab", "bc",
 * "abc" Input: "dog" Output: arduino CopyEdit "d", "o", "g", "do", "og", "dog"
 * ________________________________________ 44. Find all unique substrings of a
 * given string Input: "banana" Output: arduino CopyEdit "b", "a", "n", "ba",
 * "an", "na", "ban", "ana", "nana", "banan", "anana", "banana"
 */
import java.util.Arrays;

public class String_Problems {

    public static void main(String[] args) {
        String[] arr = {"hello", "hi", "welcome"};
        char[] arr2 = {'a', 'b', 'c'};
        String s = "banana";
        prob1(s);
        prob2(s);
        prob3(s);
        prob4(s, "an");
        prob5(s, 'a');
        prob6(s, "an");
        prob7(s, "a", "n");
        prob8(s);
        prob9(" space ");
        prob10(s, 2, 6);
        prob11("Hi,Hello welcome");
        prob12(arr, "-");
        prob13(s);
        prob14(s);
        prob15(s, 'a');
        prob16(s);
        prob17(s);
        prob18(arr2);
    }

    public static void prob1(String s) {
        System.out.println("Length of " + s + " = " + s.length());
    }

    public static void prob2(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void prob3(String s) {
        System.out.println(s);
    }

    public static void prob4(String s, String s1) {
        System.out.println(s.contains(s1));
    }

    public static void prob5(String s, char t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                System.out.print("First: " + i + ", ");
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                System.out.println("Last: " + i);
                break;
            }
        }
    }

    public static void prob6(String s, String t) {
        boolean res = false;
        String temp = "";
        temp = s.substring(0, t.length());
        if (temp.equals(t)) {
            res = true;
            System.out.println(res);
            return;
        }
        temp = s.substring((s.length() - 1 - t.length()) + 1, s.length());
        if (temp.equals(t)) {
            res = true;
            System.out.println(res);
            return;
        }
        System.out.println(res);
    }

    public static void prob7(String s, String key, String rep) {
        String res = s.replace(key, rep);
        System.out.println(res);
    }

    public static void prob8(String s) {
        System.out.println("Lower case: " + s.toLowerCase());
        System.out.println("Upper case: " + s.toUpperCase());
    }

    public static void prob9(String s) {
        String res = s.replace(" ", "");
        System.out.println(res);
    }

    public static void prob10(String s, int a, int b) {
        String res = s.substring(a, b - 1);
        System.out.println(res);
    }

    public static void prob11(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',' || s.charAt(i) == ' ') {
                System.out.println();
                continue;
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }

    public static void prob12(String[] s, String a) {
        String res = "";
        for (int i = 0; i < s.length; i++) {
            res += s[i];
            if (i != s.length - 1) {
                res += a;
            }
        }
        System.out.println(res);
    }

    public static void prob13(String a) {
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            res += a.charAt(i);
        }
        System.out.println(res);
    }

    public static void prob14(String a) {
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            res += a.charAt(i);
        }
        System.out.println(res.equals(a));
    }

    public static void prob15(String a, char b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void prob16(String a) {
        int vCount = 0, cCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U') {
                vCount++;
            } else {
                cCount++;
            }
        }
        System.out.println("Vowels: " + vCount + ", Consonants: " + cCount);
    }

    public static void prob17(String a) {
        int size = a.length();
        char[] res = new char[size];
        for (int i = 0; i < size; i++) {
            res[i] = a.charAt(i);
        }
        System.out.println(Arrays.toString(res));
    }

    public static void prob18(char[] a) {
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res += a[i];
        }
        System.out.println(res);
    }
}
