package string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/25 17:09
 * @description：
 */
public class MyAtoiTest {

    @Test
    public void myAtoi() {
        String s1 = "  -42";
        String s2 = "4193 with words";
        String s3 = "words and 987";
        String s4 = "-91283472332";
        assertEquals(-42,MyAtoi.myAtoi(s1));
        assertEquals(4193,MyAtoi.myAtoi(s2));
        assertEquals(0,MyAtoi.myAtoi(s3));
        assertEquals(-2147483648,MyAtoi.myAtoi(s4));


    }
}