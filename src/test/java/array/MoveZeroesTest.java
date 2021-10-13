package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/13 14:07
 * @description：
 */
public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        int[] nums = {0, 0, 1};
        MoveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}