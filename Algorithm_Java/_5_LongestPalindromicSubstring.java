package com.mecewe.Leetcode;

/**
*5. Longest Palindromic Substring

	Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

	Example 1:

	Input: "babad"
	Output: "bab"
	Note: "aba" is also a valid answer.
	Example 2:

	Input: "cbbd"
	Output: "bb"

*/


public class _5_LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int max = 1, maxPos = 0;
        String subStr = null;
        for (int i = 0; i < s.length(); i++) {
            if (max < lengthOfSubstring(s, i)) {
                max = lengthOfSubstring(s, i);
                maxPos = i;
            }
        }
        System.out.println("max:" + max + " maxPos:" + maxPos);
        if (s.length() == 0) {
            return "";
        } else if (max % 2 == 0) {
            if (maxPos + max / 2 + 1 < s.length()) {
                subStr = s.substring(maxPos - max / 2 + 1, maxPos + max / 2 + 1);
            } else {
                subStr = s.substring(maxPos - max / 2 + 1);
            }
        } else {
            if (maxPos + max / 2 + 1 < s.length()) {
                subStr = s.substring(maxPos - max / 2, maxPos + max / 2 + 1);
            } else {
                subStr = s.substring(maxPos - max / 2);
            }
        }
        return subStr;
    }

    public int lengthOfSubstring(String s,int pos){
        int len = 0;
        int radius1 = 0;
        int radius2 = 0;
        Boolean tag = false;
        while ( (pos-radius1>=0) && (pos+radius1<=s.length()-1) && s.charAt(pos-radius1) == s.charAt(pos+radius1)){
            radius1++;
        }
        if(pos+1 <= s.length()-1 && s.charAt(pos) == s.charAt(pos+1)){
            while ((pos-radius2>=0) && (pos+radius2+1<=s.length()-1) && s.charAt(pos-radius2) == s.charAt(pos+1+radius2)){
                radius2++;
            }
        }
        len = Math.max(radius1*2-1,radius2*2);
        return len;
    }
}
