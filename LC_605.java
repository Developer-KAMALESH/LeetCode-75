
/** You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 *  *Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 *
 *  *Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 *
 *  *Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */
public class LC_605 {
    //This approach passed only 10/130 testcases

    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int end = flowerbed.length, count = 0;
        boolean res = false;
        if (end == 1 && n == 1) {
            if (flowerbed[0] == 0) {
                res = true;
            }
            return res;
        } else {
            for (int i = 0; i < end; i++) {
                if (flowerbed[i] == 0 && i <= end - 3) {
                    if (flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
                        count++;
                    }
                }
                if (i == end - 2) {
                    if ((flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) && flowerbed[i] == 0) {
                        count++;
                        break;
                    }
                }
            }
            if (n <= count) {
                return true;
            } else {
                return false;
            }
        }
    }

    //This approach passed 124/130 testcases    
    public boolean canPlaceFlowers2(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;
        boolean res = false;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Mark as planted
                    count++;
                    if (count >= n) {
                        res = true;
                    }
                }
            }
        }
        return res;
    }

    //This approach passed all the testcases    
    public boolean canPlaceFlowers3(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Mark as planted
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }
}
