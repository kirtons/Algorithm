package string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/20 15:31
 * @description：
 */
public class ReverseNumTest {

    @Test
    public void reverseNum() {
        assertEquals(-5147,ReverseNum.reverseNum(-7415));
    }
}