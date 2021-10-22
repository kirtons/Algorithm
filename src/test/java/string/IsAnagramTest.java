package string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/22 10:32
 * @description：
 */
public class IsAnagramTest {

    @Test
    public void isAnagram() {
        String s = "anagram";
        String t = "nagaram";
        assertEquals(true, IsAnagram.isAnagram(s, t));
    }

    @Test
    public void isAnagram2() {
        String s = "rat";
        String t = "car";
        assertEquals(false, IsAnagram.isAnagram2(s, t));
    }
}