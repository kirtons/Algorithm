package string;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/9/24 15:10
 * @description：
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {

        if (s == null || s.length() == 0)
            return true;

        s = s.toLowerCase();

        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if (s.charAt(left) != s.charAt(right))
                return false;
        }
        return true;
    }

}
