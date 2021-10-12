package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/12 11:13
 * @description：
 */
public class PlusOneTest {

    @Test
    public void plusOne() {
        int[] digits1 = {1,3,5};
        System.out.println(Arrays.toString(PlusOne.plusOne(digits1)));

        int[] digits2 = {6,6,9};
        System.out.println(Arrays.toString(PlusOne.plusOne(digits2)));
    }
}