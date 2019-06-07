package com.mecewe.Leetcode;

/**
 *6. ZigZag Conversion
 *
         The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

         P   A   H   N
         A P L S I I G
         Y   I   R

         And then read line by line: "PAHNAPLSIIGYIR"
         Write the code that will take a string and make this conversion given a number of rows:
         string convert(string s, int numRows);

         Example 1:
         Input: s = "PAYPALISHIRING", numRows = 3
         Output: "PAHNAPLSIIGYIR"

         Example 2:
         Input: s = "PAYPALISHIRING", numRows = 4
         Output: "PINALSIGYAHRPI"
         Explanation:

         P     I    N
         A   L S  I G
         Y A   H R
         P     I
 */


public class _6_ZigZagConversion {

    public String convert(String s, int numRows) {
        StringBuilder str = new StringBuilder();
        if(s.length() ==0 || numRows==1){
            return s;
        }
        int round = s.length()/(numRows*2-2);
        for(int i=0;i<numRows;i++){
            for(int j=0;j<round;j++){
                str.append(s.charAt(i + j * (numRows * 2 - 2)));
                if(i>0 && i< numRows-1){
                    str.append(s.charAt((j+1) * (numRows * 2 - 2)-i));
                }
            }
            if((numRows*2-2)*round+i <s.length()){
                str.append(s.charAt((numRows*2-2)*round+i));
            }
            if((numRows*2-2)*round+i !=(numRows*2-2)*(round+1)-i &&(numRows*2-2)*(round+1)-i <s.length()){
                str.append(s.charAt((numRows*2-2)*(round+1)-i));
            }
            str.append(" ");
        }
        return str.toString();
    }
}
