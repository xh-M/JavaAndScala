package finallyCode;

import java.util.HashMap;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/4/20
 */
public class Array_Window {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Array_Window window = new Array_Window();
        int i = window.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int result = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        while(right < chars.length){
            char rightChar = chars[right];
            window.put(rightChar,window.getOrDefault(rightChar,0) + 1);
            right++;

            while (window.get(rightChar) > 1){
                char leftChar = chars[left];
                window.put(leftChar,window.get(leftChar) - 1);
                left++;
            }
            result = Math.max(result,right-left);
        }
        return result;
    }
}
