package array;

import java.util.Arrays;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/13 11:25
 * @description：移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < len) {
            nums[index++] = 0;
        }
    }

    public static void moveZeroes2(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }


}
