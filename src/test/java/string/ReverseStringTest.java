package string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/20 14:41
 * @description：
 */
public class ReverseStringTest {

    @Test
    public void reverseString() {
        char[] s = {'p','e','a','c','e'};
        ReverseString.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}