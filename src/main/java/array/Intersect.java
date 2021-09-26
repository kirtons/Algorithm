package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/9/26 10:38
 * @description：
 * 给定两个数组，编写一个函数来计算它们的交集
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 */
public class Intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
