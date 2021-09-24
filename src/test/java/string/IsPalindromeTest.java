package string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/9/24 16:59
 * @description：
 */
public class IsPalindromeTest {

    @Test
    public void isPalindrome() {
        assertEquals(true,IsPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}