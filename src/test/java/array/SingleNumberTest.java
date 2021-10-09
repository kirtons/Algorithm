package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/9 15:16
 * @description：
 */
public class SingleNumberTest {

    @Test
    public void singleNumber() {
        int[] nums = {4,1,2,1,2};
        assertEquals(4, SingleNumber.singleNumber(nums));
    }
}