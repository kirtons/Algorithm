package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/9/27 14:42
 * @description：
 */
public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicates() {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5,RemoveDuplicates.removeDuplicates(nums));
    }
}