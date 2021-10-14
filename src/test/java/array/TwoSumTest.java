package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/14 10:33
 * @description：
 */
public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(TwoSum.twoSum(nums,22)));
    }
}