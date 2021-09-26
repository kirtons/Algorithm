package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/9/26 10:57
 * @description：
 */
public class IntersectTest {

    @Test
    public void intersect() {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        System.out.println(Arrays.toString(Intersect.intersect(nums1, nums2)));
    }
}