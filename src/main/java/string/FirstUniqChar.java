package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/21 11:15
 * @description：字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1
 *
 * s = "loveleetcode"
 * 返回 2
 */
public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

}
