package string;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/20 14:50
 * @description：整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 输入：x = -123
 * 输出：-321
 */
public class ReverseNum {
    public static int reverseNum(int x) {
        long result = 0;
        while (x != 0) {
            result = (result * 10) + (x % 10);
            x /= 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }

}
