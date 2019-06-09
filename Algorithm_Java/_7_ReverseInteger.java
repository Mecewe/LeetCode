package com.mecewe.Leetcode;

/**
 * 7. Reverse Integer
 *
         Given a 32-bit signed integer, reverse digits of an integer.

         Example 1:
         Input: 123
         Output: 321

         Example 2:
         Input: -123
         Output: -321

         Example 3:
         Input: 120
         Output: 21
         Note:
         Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
         [−2^31, 2^31 −1]. For the purpose of this problem,
         assume that your function returns 0 when the reversed integer overflows.
 */

public class _7_ReverseInteger {
    public static int reverse(int x) {
//        int len = (int) Math.log(Math.abs(x)); //判断长度
        int len = (x+"").length(); //转化成字符串判断整数长度，但是速度较慢
//        if((long)(-1)*Integer.MIN_VALUE > (long)Integer.MAX_VALUE)

        if((long)x*(-1) > Integer.MAX_VALUE ){//INT MIN:-2147483648 MAX:2147483647
            return 0;
        }
        int temp = Math.abs(x);
        if(x<0){
            len--;
        }
        System.out.println("len:"+len+" "+x);
        int res = 0;
        for(int i=0;i<len ;i++){
            if(x>0 && res+temp%10 * Math.pow(10,len-i-1) <= Integer.MAX_VALUE ){
                res += temp%10 * Math.pow(10,len-i-1);
                temp /=10;
            }else if(x<0 && (res+temp%10 * Math.pow(10,len-i-1))*(-1) >= Integer.MIN_VALUE ){
                res += temp%10 * Math.pow(10,len-i-1);
                temp /=10;
            } else {
                res = 0;
                break;
            }
        }
        if(x <0 && res != 0){
            res *=-1;
        }
        return res;
    }
}
