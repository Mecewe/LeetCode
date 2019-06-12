package com.mecewe.Leetcode;

/**
 * 12. Integer to Roman
         Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

         Symbol       Value
         I             1
         V             5
         X             10
         L             50
         C             100
         D             500
         M             1000
         For example, two is written as II in Roman numeral, just two one's added together.
         Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

         Roman numerals are usually written largest to smallest from left to right.
         However, the numeral for four is not IIII. Instead, the number four is written as IV.
         Because the one is before the five we subtract it making four. The same principle applies to the number nine,
         which is written as IX. There are six instances where subtraction is used:

         I can be placed before V (5) and X (10) to make 4 and 9.
         X can be placed before L (50) and C (100) to make 40 and 90.
         C can be placed before D (500) and M (1000) to make 400 and 900.
         Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

         Example 1:
         Input: "III"
         Output: 3

         Example 2:
         Input: "IV"
         Output: 4

         Example 3:
         Input: "IX"
         Output: 9

         Example 4:
         Input: "LVIII"
         Output: 58
         Explanation: L = 50, V= 5, III = 3.

         Example 5:
         Input: "MCMXCIV"
         Output: 1994
         Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */


public class _12_IntegertoRoman {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        while (num > 0){
            if(num < 4 ){
                str.append("I");
                num--;
            }else if(num == 4){
                str.append("IV");
                num -= 4;
            }else if(num < 9){
                str.append("V");
                num -= 5;
            }else if(num == 9){
                str.append("IX");
                num -= 9;
            }else if(num < 40 ){
                str.append("X");
                num -= 10;
            }else if(num < 50){
                str.append("XL");
                num -= 40;
            }else if(num < 90){
                str.append("L");
                num -= 50;
            }else if(num < 100){
                str.append("XC");
                num -= 90;
            }else if(num < 400 ){
                str.append("C");
                num -= 100;
            }else if(num <500){
                str.append("CD");
                num -= 400;
            }else if(num < 900){
                str.append("D");
                num -= 500;
            }else if(num <1000){
                str.append("CM");
                num -= 900;
            }else if(num < 4000){
                str.append("M");
                num -= 1000;
            }
        }
        return str.toString();
    }
}
