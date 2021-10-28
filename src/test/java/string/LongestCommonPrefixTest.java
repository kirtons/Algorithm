package string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/28 14:40
 * @description：
 */
public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        String[] strs = {"flower","flow","flight"};
        String[] strs2 = {"dog","dogaa","dogsss"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs));
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs2));


    }
}