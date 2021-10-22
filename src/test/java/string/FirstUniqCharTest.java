package string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/21 13:53
 * @description：
 */
public class FirstUniqCharTest {

    @Test
    public void firstUniqChar() {
        String s1 = "loveleetcode";
        assertEquals(2,FirstUniqChar.firstUniqChar(s1));

        String s2 = "leetcode";
        assertEquals(0,FirstUniqChar.firstUniqChar(s2));

        String s3 = "sssss";
        assertEquals(-1,FirstUniqChar.firstUniqChar(s3));
    }
}