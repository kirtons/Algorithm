package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/8 10:14
 * @description：
 */
public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertEquals(true,ContainsDuplicate.containsDuplicate(nums));

    }

    @Test
    public void containsDuplicate2() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertEquals(true,ContainsDuplicate.containsDuplicate2(nums));

    }
}