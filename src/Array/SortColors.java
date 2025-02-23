package Array;

import java.util.Arrays;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */

/*
solution approach : three pointer approach lso known as dutch flag problem
case 0: swap with the element at the start pointer, start++,middle++
case 1: no swapping, middle++
case 2: swap with the end pointer, end--
 */
public class SortColors {
    public static void swap(int[] nums, int pos1, int pos2)
    {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] =temp;
    }
    public static void sortColor(int[] nums)
    {
//        take three pointers, start , middle , end
        int start=0, middle =0, end=nums.length-1;

        while(middle <= end)
        {
            switch (nums[middle])
            {
                case 0:
//                     swap with start index
                  swap(nums,middle,start);
                  start ++;
                  middle ++;
                  break;

                case 1:
                    middle ++;
                    break;

                case 2:
                    swap(nums, middle,end);
                    end --;
            }
        }


    }
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        sortColor(nums);
        System.out.println((Arrays.toString(nums)));
    }
}
