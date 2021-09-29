package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/9/28 14:39
 * @description：
 */
public class MaxProfitTest {

    @Test
    public void maxProfit() {
        int prices1[] = {2, 5, 1, 3};
        assertEquals(3, MaxProfit.maxProfit(prices1));

        int prices2[] = {7, 1, 5, 3, 6, 4};
        assertEquals(5, MaxProfit.maxProfit(prices2));

        int prices3[] = {7, 6, 4, 3, 1};
        assertEquals(0, MaxProfit.maxProfit(prices3));
    }

    @Test
    public void maxProfit2() {
        int prices1[] = {7,1,5,3,6,4};
        assertEquals(7,MaxProfit.maxProfit2(prices1));
    }
}