package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/9/30 13:56
 * @description：
 */
public class RotateTest {

    @Test
    public void rotate() {
        int nums1[] = {1, 2, 3, 4, 5, 6, 7}, k1 = 3;
        int nums2[] = {-1, -100, 3, 99}, k2 = 2;
        Rotate.rotate(nums1, k1);
        // {5,6,7,1,2,3,4}
        System.out.println(Arrays.toString(nums1));

        Rotate.rotate(nums2, k2);
        // 3,99,-1,-100
        System.out.println(Arrays.toString(nums2));


    }

    @Test
    public void rotate2() {
        int nums1[] = {1, 2, 3, 4, 5, 6, 7}, k1 = 3;
        int nums2[] = {-1, -100, 3, 99}, k2 = 2;

        Rotate.rotate2(nums1, k1);
        // {5,6,7,1,2,3,4}
        System.out.println(Arrays.toString(nums1));

        Rotate.rotate2(nums2, k2);
        // 3,99,-1,-100
        System.out.println(Arrays.toString(nums2));

    }
}