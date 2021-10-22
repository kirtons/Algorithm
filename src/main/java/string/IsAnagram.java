package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：zhangyu
 * @date ：Created in 2021/10/22 10:20
 * @description：有效的字母异位词 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 */
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Map<Character, Integer> sMap = new HashMap();
        Map<Character, Integer> tMap = new HashMap();

        for (char i : sChar) {
            sMap.put(i, sMap.getOrDefault(i, 0) + 1);
        }
        for (char j : tChar) {
            tMap.put(j, tMap.getOrDefault(j, 0) + 1);
        }
        for (char sKey : sMap.keySet()) {
            if (!sMap.get(sKey).equals(tMap.get(sKey))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letterCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            if (letterCount[t.charAt(j) - 'a'] == 0) {
                return false;
            }
            letterCount[t.charAt(j) - 'a']--;
        }
        return true;
    }

}
