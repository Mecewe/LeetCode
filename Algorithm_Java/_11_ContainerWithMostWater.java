package com.mecewe.Leetcode;

public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int head = height.length-1;
        int tail = 0;
        int maxSum = 0;
        int minY = 0;
        int lenX = head - tail;
        while (lenX > 0){
            minY = Math.min(height[head],height[tail]);
            if(lenX * minY > maxSum){
                maxSum = lenX * minY;
            }
            if(minY == height[head]){
                head--;
            }else {
                tail++;
            }
            lenX = head - tail;
        }
        return maxSum;
    }
}
