package com.mecewe.Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *3. Longest Substring Without Repeating Characters
 *
         Given a string, find the length of the longest substring without repeating characters.

         Example 1:
         Input: "abcabcbb"
         Output: 3
         Explanation: The answer is "abc", with the length of 3.

         Example 2:
         Input: "bbbbb"
         Output: 1
         Explanation: The answer is "b", with the length of 1.

         Example 3:
         Input: "pwwkew"
         Output: 3
         Explanation: The answer is "wke", with the length of 3.
         Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */


public class _3_LongestSubstringWithoutRepeatingCharacters {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character,Integer> map = new HashMap<>();
            char[] charArray = s.toCharArray();
            int n = charArray.length;
            int count=0;
            int max=0;
            int tail=0;
            for(int i=0;i<n;i++){
                if(!map.containsKey(charArray[i])){
                    map.put(charArray[i],i);
                    count++;
                }else{
                    if(tail<map.get(charArray[i])){
                        tail = map.get(charArray[i]);
                    }
                    map.put(charArray[i],i);
                    count= i-tail;
                }
                if(max<count){
                    max = count;
                }
            }
            return max;
        }
    }
}
