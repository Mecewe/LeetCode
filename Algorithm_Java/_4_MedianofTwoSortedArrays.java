package com.mecewe.Leetcode;

/**
 *4. Median of Two Sorted Arrays
 *
         There are two sorted arrays nums1 and nums2 of size m and n respectively.

         Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

         You may assume nums1 and nums2 cannot be both empty.

         Example 1:

         nums1 = [1, 3]
         nums2 = [2]

         The median is 2.0
         Example 2:

         nums1 = [1, 2]
         nums2 = [3, 4]

         The median is (2 + 3)/2 = 2.5
 */



public class _4_MedianofTwoSortedArrays {

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int i = 0;
            int j = 0;
            int[] arr = new int[n + m];
            double median = 0;
            while (i + j <= (m + n) / 2) {
                if (j == n || (i < m && nums1[i] <= nums2[j])) {
                    arr[i + j] = nums1[i];
                    i++;
                } else if (i == m || (j < n && nums1[i] > nums2[j])) {
                    arr[i + j] = nums2[j];
                    j++;
                }
            }
            if ((m + n) % 2 == 0) {
                median = (arr[i + j - 1] + arr[i + j - 2]) / 2.0;
            } else {
                median = arr[i + j - 1];
            }
            return median;
        }
    }
}
